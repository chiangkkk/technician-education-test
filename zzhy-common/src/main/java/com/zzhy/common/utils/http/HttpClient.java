package com.zzhy.common.utils.http;



import org.apache.http.*;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.IdleConnectionEvictor;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.*;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * http请求工具类，支持https
 * <p>
 * Title: HttpClient
 * </p>
 * 
 * @author user
 *
 * @date 2017年4月18日 上午11:36:47
 */
public class HttpClient {
	private static CloseableHttpClient httpClient;
	private static RequestConfig requestConfig;
	// #设置连接总数
	private static final int maxTotal = 2000;
	// #设置每个主机最大的并发数
	private static final int defaultMaxPerRoute = 500;
	// #设置创建连接的最长时间
	private static final int connectTimeout = 10000;
	// #从连接池中获取到连接的最长时间
	private static final int connectionRequestTimeout = 1000;
	// #数据传输的最长时间
	private static final int socketTimeout = 20000;
	// #空闲时间(用于定期清理空闲连接)
	private static final int maxIdleTime = 1;
	// #提交请求前测试连接是否可用
//	private static final boolean staleConnectionCheckEnabled = true;
	public static final String DEFAULT_CHARSET = "UTF-8";
	private static final Charset CHARSET = Charset.forName("UTF-8");

	static {
		SSLContext sslContext = null;
		try {
			sslContext = SSLContext.getInstance("SSLv3");
			X509TrustManager trustManager = new X509TrustManager() {

				public X509Certificate[] getAcceptedIssuers() {
					return null;
				}

				public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {

				}

				public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {

				}
			};

			sslContext.init(null, new TrustManager[] { trustManager }, null);
		} catch (KeyManagementException e) {
			throw new RuntimeException(e);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}

		Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
				.register("http", PlainConnectionSocketFactory.INSTANCE)
				.register("https", new SSLConnectionSocketFactory(sslContext)).build();

		PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
		cm.setMaxTotal(maxTotal);
		cm.setDefaultMaxPerRoute(defaultMaxPerRoute);

		HttpClientBuilder hcb = HttpClientBuilder.create();
		hcb.setConnectionManager(cm);
		httpClient = hcb.build();

		RequestConfig.Builder builder = RequestConfig.custom();
		builder.setConnectTimeout(connectTimeout);
		builder.setConnectionRequestTimeout(connectionRequestTimeout);
		builder.setSocketTimeout(socketTimeout);
		requestConfig = builder.build();

		new IdleConnectionEvictor(cm, maxIdleTime, TimeUnit.MINUTES);
	}

	/**
	 * 执行get请求
	 *
	 * @param url
	 *            请求地址
	 * @return
	 * @throws IOException
	 */
	public static HttpResult doGet(String url) throws IOException {
		// 创建httpClient对象
		CloseableHttpResponse response = null;
		HttpGet httpGet = new HttpGet(url);
		// 设置请求参数
		httpGet.setConfig(requestConfig);
		try {
			// 执行请求
			response = httpClient.execute(httpGet);

			return assembResp(response);
			// 判断返回状态码是否为200
			// if (response.getStatusLine().getStatusCode() == 200)
			// {
			// return EntityUtils.toString(response.getEntity(), "UTF-8");
			// }
		} finally {
			if (response != null) {
				EntityUtils.consume(response.getEntity());
				response.close();
			}
		}
	}

	/**
	 * get请求，返回byte[]类型
	 * 
	 * @param url
	 *            请求地址
	 * @return byte[]类型
	 * @throws IOException
	 */
	public static byte[] doGetToByte(String url) throws IOException {
		// 创建httpClient对象
		CloseableHttpResponse response = null;
		HttpGet httpGet = new HttpGet(url);
		// 设置请求参数
		httpGet.setConfig(requestConfig);
		try {
			// 执行请求
			response = httpClient.execute(httpGet);
			return EntityUtils.toByteArray(response.getEntity());
		} finally {
			if (response != null) {
				EntityUtils.consume(response.getEntity());
				response.close();
			}
		}
	}

	/**
	 * 执行带有参数的get请求
	 * 
	 * @param url
	 *            请求地址
	 * @param param
	 *            参数，格式：a=xx&b=xx&c=xx
	 * @return
	 * @throws IOException
	 */
	public static HttpResult doGet(String url, String param) throws IOException {
		return doGet(url + "?" + param);
	}

	/**
	 * 执行带有参数的get请求
	 *
	 * @param url
	 *            请求地址
	 * @param paramMap
	 *            参数map
	 * @return
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	public static HttpResult doGet(String url, Map<String, String> paramMap) throws IOException, URISyntaxException {
		URIBuilder builder = new URIBuilder(url);
		for (String s : paramMap.keySet()) {
			builder.addParameter(s, paramMap.get(s));
		}
		return doGet(builder.build().toString());
	}

	/**
	 * 执行post
	 * 
	 * @param url
	 *            请求地址
	 * @param param
	 *            参数
	 * @param contentType
	 *            请求内容格式
	 * @return
	 * @throws IOException
	 */
	public static HttpResult doPost(String url, String param, ContentType contentType) throws IOException {
		HttpPost httpPost = new HttpPost(url);
		// 设置请求参数
		httpPost.setConfig(requestConfig);
		if (param != null && param.length() > 0) {
			StringEntity formEntity = new StringEntity(param, contentType);
			// 将请求实体放入到httpPost中
			httpPost.setEntity(formEntity);
		}
		// 创建httpClient对象
		CloseableHttpResponse response = null;
		try {
			// 执行请求
			response = httpClient.execute(httpPost);
			return assembResp(response);
		} finally {
			if (response != null) {
				EntityUtils.consume(response.getEntity());
				response.close();
			}
		}
	}

	/**
	 * 执行post表单数据
	 * 
	 * @param url
	 *            请求地址
	 * @param formParam
	 *            表单字符串，例如:a=xxx&b=xxx&c=xx
	 * @param charset
	 *            字符集
	 * @return
	 * @throws IOException
	 */
	public static HttpResult doPostForm(String url, String formParam, Charset charset) throws IOException {
		HttpPost httpPost = new HttpPost(url);
		// 设置请求参数
		httpPost.setConfig(requestConfig);
		if (formParam != null && formParam.length() > 0) {
			StringEntity formEntity = new StringEntity(formParam,
					ContentType.create("application/x-www-form-urlencoded", charset));
			// 将请求实体放入到httpPost中
			httpPost.setEntity(formEntity);
		}
		// 创建httpClient对象
		CloseableHttpResponse response = null;
		try {
			// 执行请求
			response = httpClient.execute(httpPost);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == 301 || statusCode == 302) {
				// 重定向
				Header[] headers = response.getHeaders("Location");
				return new HttpResult(response.getStatusLine().getStatusCode(),
						headers[0].getValue() /*
												 * EntityUtils.toString(response.
												 * getEntity())
												 */);
			} else {
				return assembResp(response);
			}
		} finally {
			if (response != null) {
				EntityUtils.consume(response.getEntity());
				response.close();
			}
		}
	}

	/**
	 * 执行post表单数据
	 *
	 * @param url
	 *            请求地址
	 * @param params
	 *            表单数据
	 * @return
	 * @throws IOException
	 */
	public static HttpResult doPostForm(String url, Map<String, String> params, Charset charset) throws IOException {
		HttpPost httpPost = new HttpPost(url);
		// 设置请求参数
		httpPost.setConfig(requestConfig);
		if (params != null && !params.isEmpty()) {
			List<NameValuePair> parameters = new ArrayList<NameValuePair>();
			for (String s : params.keySet()) {
				parameters.add(new BasicNameValuePair(s, params.get(s)));
			}
			// 构建一个form表单式的实体
			UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(parameters,
					charset/* Charset.forName("UTF-8") */);
			// 将请求实体放入到httpPost中
			httpPost.setEntity(formEntity);
		}
		// 创建httpClient对象
		CloseableHttpResponse response = null;
		try {
			// 执行请求
			response = httpClient.execute(httpPost);
			return assembResp(response);
		} finally {
			if (response != null) {
				EntityUtils.consume(response.getEntity());
				response.close();
			}
		}
	}

	/**
	 * post表单数据
	 * 
	 * @param url
	 *            请求地址
	 * @param params
	 *            参数map
	 * @param headers
	 *            请求头map
	 * @param charset
	 *            字符集
	 * @return
	 * @throws IOException
	 */
	public static HttpResult doPostForm(String url, Map<String, String> params, Map<String, String> headers,
			Charset charset) throws IOException {
		HttpPost httpPost = new HttpPost(url);
		// 设置请求参数
		httpPost.setConfig(requestConfig);
		if (params != null && !params.isEmpty()) {
			List<NameValuePair> parameters = new ArrayList<NameValuePair>();
			for (String s : params.keySet()) {
				parameters.add(new BasicNameValuePair(s, params.get(s)));
			}
			// 构建一个form表单式的实体
			UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(parameters,
					charset/* Charset.forName("UTF-8") */);
			// 将请求实体放入到httpPost中
			httpPost.setEntity(formEntity);
		}
		if (headers != null && !headers.isEmpty()) {
			Iterator<Map.Entry<String, String>> iter = headers.entrySet().iterator();

			while (iter.hasNext()) {
				Map.Entry<String, String> entry = iter.next();
				httpPost.setHeader(entry.getKey(), entry.getValue());
			}
		}
		// 创建httpClient对象
		CloseableHttpResponse response = null;
		try {
			// 执行请求
			response = httpClient.execute(httpPost);
			return assembResp(response);
		} finally {
			if (response != null) {
				EntityUtils.consume(response.getEntity());
				response.close();
			}
		}
	}

	/**
	 * 执行post请求
	 * 
	 * @param url
	 *            请求地址
	 * @return
	 * @throws IOException
	 */
	public static HttpResult doPost(String url) throws IOException {
		return doPostForm(url, "", Charset.forName("UTF-8"));
	}

	/**
	 * post json数据
	 *
	 * @param url
	 *            请求地址
	 * @param json
	 *            json数据
	 * @param charset
	 *            字符集
	 * @return
	 * @throws IOException
	 */
	public static HttpResult doPostJson(String url, String json, Charset charset) throws IOException {
		// 创建http POST请求
		HttpPost httpPost = new HttpPost(url);
		httpPost.setConfig(requestConfig);

		if (json != null) {
			// 构造一个请求实体
			StringEntity stringEntity = new StringEntity(json, ContentType.create("application/json", charset));
			// 将请求实体设置到httpPost对象中
			httpPost.setEntity(stringEntity);
		}
		CloseableHttpResponse response = null;
		try {
			// 执行请求
			response = httpClient.execute(httpPost);
			return assembResp(response);
		} finally {
			if (response != null) {
				EntityUtils.consume(response.getEntity());
				response.close();
			}
		}
	}

	/**
	 * post json数据
	 * 
	 * @param url
	 *            请求地址
	 * @param json
	 *            json数据
	 * @param headers
	 *            请求头map
	 * @param charset
	 *            字符集
	 * @return
	 * @throws IOException
	 */
	public static HttpResult doPostJson(String url, String json, Map<String, String> headers, Charset charset)
			throws IOException {
		// 创建http POST请求
		HttpPost httpPost = new HttpPost(url);
		httpPost.setConfig(requestConfig);

		if (json != null) {
			// 构造一个请求实体
			StringEntity stringEntity = new StringEntity(json, ContentType.create("application/json", charset));
			// 将请求实体设置到httpPost对象中
			httpPost.setEntity(stringEntity);
		}
		if (headers != null && !headers.isEmpty()) {
			Iterator<Map.Entry<String, String>> iter = headers.entrySet().iterator();
			while (iter.hasNext()) {
				Map.Entry<String, String> entry = (Map.Entry<String, String>) iter.next();
				httpPost.setHeader(entry.getKey(), entry.getValue());
			}
		}

		CloseableHttpResponse response = null;
		try {
			// 执行请求
			response = httpClient.execute(httpPost);
			return assembResp(response);
		} finally {
			if (response != null) {
				EntityUtils.consume(response.getEntity());
				response.close();
			}
		}
	}

	/**
	 * 提交xml数据
	 * 
	 * @param url
	 *            请求地址
	 * @param xml
	 *            xml数据
	 * @param charset
	 *            字符集
	 * @return
	 * @throws IOException
	 */
	public static HttpResult doPostXml(String url, String xml, Charset charset) throws IOException {
		// 创建http POST请求
		HttpPost httpPost = new HttpPost(url);
		httpPost.setConfig(requestConfig);

		if (xml != null) {
			// 构造一个请求实体
			StringEntity stringEntity = new StringEntity(xml,
					/* ContentType.APPLICATION_XML */ ContentType.create("application/xml", charset));
			// 将请求实体设置到httpPost对象中
			httpPost.setEntity(stringEntity);
		}
		CloseableHttpResponse response = null;
		try {
			// 执行请求
			response = httpClient.execute(httpPost);
			return assembResp(response);
		} finally {
			if (response != null) {
				EntityUtils.consume(response.getEntity());
				response.close();
			}
		}
	}

	/**
	 * 提交post数据，带请求头
	 * 
	 * @param url
	 *            请求地址
	 * @param xml
	 *            xml数据
	 * @param headers
	 *            请求头map
	 * @param charset
	 *            字符集
	 * @return
	 * @throws IOException
	 */
	public static HttpResult doPostXml(String url, String xml, Map<String, String> headers, Charset charset)
			throws IOException {
		// 创建http POST请求
		HttpPost httpPost = new HttpPost(url);
		httpPost.setConfig(requestConfig);

		if (xml != null) {
			// 构造一个请求实体
			StringEntity stringEntity = new StringEntity(xml,
					/* ContentType.APPLICATION_XML */ ContentType.create("application/xml", charset));
			// 将请求实体设置到httpPost对象中
			httpPost.setEntity(stringEntity);
		}
		if (headers != null && !headers.isEmpty()) {
			Iterator<Map.Entry<String, String>> iter = headers.entrySet().iterator();
			while (iter.hasNext()) {
				Map.Entry<String, String> entry = (Map.Entry<String, String>) iter.next();
				httpPost.setHeader(entry.getKey(), entry.getValue());
			}
		}
		CloseableHttpResponse response = null;
		try {
			// 执行请求
			response = httpClient.execute(httpPost);
			return assembResp(response);
		} finally {
			if (response != null) {
				EntityUtils.consume(response.getEntity());
				response.close();
			}
		}
	}

	private static HttpResult assembResp(CloseableHttpResponse response) throws ParseException, IOException {
		int statusCode = response.getStatusLine().getStatusCode();
		if (statusCode == 301 || statusCode == 302) {
			// 重定向
			Header[] headers = response.getHeaders("Location");
			return new HttpResult(response.getStatusLine().getStatusCode(),
					headers.length > 0 ? headers[0].getValue() : EntityUtils.toString(response.getEntity(), CHARSET));
		} else {
			return new HttpResult(response.getStatusLine().getStatusCode(),
					EntityUtils.toString(response.getEntity(), CHARSET),response.getAllHeaders());
		}
	}
	
	/**
	 * 
	 * @param url
	 * 请求地址
	 * @param head
	 * 请求头key
	 * @param headValue
	 * 请求头value
	 * @return
	 * @throws IOException
	 */
	public static HttpResult doGet(String url,String head, String headValue) throws IOException {
		// 创建httpClient对象
				CloseableHttpResponse response = null;
				HttpGet httpGet = new HttpGet(url);
				httpGet.addHeader(head, headValue);
				// 设置请求参数
				httpGet.setConfig(requestConfig);
				try {
					// 执行请求
					response = httpClient.execute(httpGet);
					
					return assembResp(response);
					// 判断返回状态码是否为200
					// if (response.getStatusLine().getStatusCode() == 200)
					// {
					// return EntityUtils.toString(response.getEntity(), "UTF-8");
					// }
				} finally {
					if (response != null) {
						EntityUtils.consume(response.getEntity());
						response.close();
					}
				}
	}
	
	public static HttpResult doGet(String url, Map<String, String> paramMap, String head, String headValue) throws IOException, URISyntaxException {
		URIBuilder builder = new URIBuilder(url);
		for (String s : paramMap.keySet()) {
			builder.addParameter(s, paramMap.get(s));
		}
		return doGet(builder.build().toString(), head, headValue);
	}
	
	
	public static HttpResult doPost(String url, Map<String, String> params, Charset charset ,String head,String headValue) throws IOException {
		HttpPost httpPost = new HttpPost(url);
		httpPost.addHeader(head, headValue);
		// 设置请求参数
		httpPost.setConfig(requestConfig);
		if (params != null && !params.isEmpty()) {
			List<NameValuePair> parameters = new ArrayList<NameValuePair>();
			for (String s : params.keySet()) {
				parameters.add(new BasicNameValuePair(s, params.get(s)));
			}
			// 构建一个form表单式的实体
			UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(parameters,
					charset/* Charset.forName("UTF-8") */);
			// 将请求实体放入到httpPost中
			httpPost.setEntity(formEntity);
		}
		// 创建httpClient对象
		CloseableHttpResponse response = null;
		try {
			// 执行请求
			response = httpClient.execute(httpPost);
			return assembResp(response);
		} finally {
			if (response != null) {
				EntityUtils.consume(response.getEntity());
				response.close();
			}
		}
	}
	
	/**
	 * post json数据
	 * 
	 * @param url
	 *            请求地址
	 * @param json
	 *            json数据
	 * @param headers
	 *            请求头map
	 * @param charset
	 *            字符集
	 * @return
	 * @throws IOException
	 */
	public static HttpResult doGetHeaders(String url, Map<String, String> headers, Charset charset)
			throws IOException {
		// 创建http POST请求
		HttpGet httpPost = new HttpGet(url);
		httpPost.setConfig(requestConfig);

		if (headers != null && !headers.isEmpty()) {
			Iterator<Map.Entry<String, String>> iter = headers.entrySet().iterator();
			while (iter.hasNext()) {
				Map.Entry<String, String> entry = (Map.Entry<String, String>) iter.next();
				httpPost.setHeader(entry.getKey(), entry.getValue());
			}
		}

		CloseableHttpResponse response = null;
		try {
			// 执行请求
			response = httpClient.execute(httpPost);
			return assembResp(response);
		} finally {
			if (response != null) {
				EntityUtils.consume(response.getEntity());
				response.close();
			}
		}
	}
	
	/**
	 * post表单数据
	 * 
	 * @param url
	 *            请求地址
	 * @param params
	 *            参数map
	 * @param headers
	 *            请求头map
	 * @param charset
	 *            字符集
	 * @return
	 * @throws IOException
	 */
	public static HttpResult doPostFormFile(String url, Map<String, File> fileParams,Map<String, String> params, Map<String, String> headers,
			Charset charset) throws IOException {
		HttpPost httpPost = new HttpPost(url);
		// 设置请求参数
		httpPost.setConfig(requestConfig);
		
        MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create();

		if (params != null && !params.isEmpty()) {
//			List<NameValuePair> parameters = new ArrayList<NameValuePair>();
			for (String s : params.keySet()) {
//				parameters.add(new BasicNameValuePair(s, params.get(s)));
				multipartEntityBuilder.addTextBody(s, params.get(s));
			}
			
			httpPost.setEntity(multipartEntityBuilder.build());
		}
		
		if (fileParams != null && !fileParams.isEmpty()) {
			for (String s : fileParams.keySet()) {
				FileBody fileBody=new FileBody(fileParams.get(s));
				multipartEntityBuilder.addPart(s, fileBody);
			}
			
			httpPost.setEntity(multipartEntityBuilder.build());
		}
		
		if (headers != null && !headers.isEmpty()) {
			Iterator<Map.Entry<String, String>> iter = headers.entrySet().iterator();

			while (iter.hasNext()) {
				Map.Entry<String, String> entry = iter.next();
				httpPost.setHeader(entry.getKey(), entry.getValue());
			}
		}
		
		// 创建httpClient对象
		CloseableHttpResponse response = null;
		try {
			// 执行请求
			response = httpClient.execute(httpPost);
			return assembResp(response);
		} finally {
			if (response != null) {
				EntityUtils.consume(response.getEntity());
				response.close();
			}
		}
	}
	
	/**
	 * http响应结果
	 * <p>
	 * Title: HttpResult
	 * </p>
	 * 
	 * @author user
	 *
	 * @date 2017年4月18日 上午11:28:13
	 */
	public static class HttpResult {
		// http返回码
		private Integer code;
		// http响应数据内容
		private String data;
		// 响应请求头内容
		private Header[] headers;

		public HttpResult(Integer code, String data) {
			this.code = code;
			this.data = data;
		}

		public HttpResult(Integer code, String data,Header[] headers) {
			this.code = code;
			this.data = data;
			this.headers = headers;
		}
		
		@Override
		public String toString() {
			return "HttpResult [code=" + code + ", data=" + data + "]";
		}

		public HttpResult() {
		}

		public Integer getCode() {
			return code;
		}

		public void setCode(Integer code) {
			this.code = code;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Header[] getHeaders() {
			return this.headers;
		}

		public void setHeaders(Header[] headers) {
			this.headers = headers;
		}
		
		
	}



	/**
	 * 执行post
	 *
	 * @param url
	 *            请求地址
	 * @param param
	 *            参数
	 * @param contentType
	 *            请求内容格式
	 * @return
	 * @throws IOException
	 */
	public static HttpResult doPostInputStream(String url, String param, ContentType contentType) throws IOException {
		HttpPost httpPost = new HttpPost(url);
		// 设置请求参数
		httpPost.setConfig(requestConfig);
		if (param != null && param.length() > 0) {
			StringEntity formEntity = new StringEntity(param, contentType);
			// 将请求实体放入到httpPost中
			InputStreamEntity reqEntity = new InputStreamEntity(new ByteArrayInputStream(param.getBytes()));
			reqEntity.setContentType("application/xml");
			reqEntity.setContentEncoding("utf-8");
			reqEntity.setChunked(true);
			httpPost.setEntity(reqEntity);
		}
		// 创建httpClient对象
		CloseableHttpResponse response = null;
		try {
			// 执行请求
			response = httpClient.execute(httpPost);
			return assembResp(response);
		} finally {
			if (response != null) {
				EntityUtils.consume(response.getEntity());
				response.close();
			}
		}
	}

	/**
	 * post方法获取字符串
	 *
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public static String postByString(String url, String param, String dataType) {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		CloseableHttpResponse httpResponse = null;
		RequestConfig config = RequestConfig.custom().setConnectTimeout(connectTimeout).setSocketTimeout(socketTimeout).build();
		httpPost.setConfig(config);

		StringEntity entity = new StringEntity(param, ContentType.create(dataType, CHARSET));
//        entity.setChunked(true);

		httpPost.setEntity(entity);

		try {
			// httpclient.
			httpResponse = httpclient.execute(httpPost);
			return executeResponse(httpResponse);
		} catch (IOException e) {
//            e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} finally {
			close(httpResponse);
		}
	}

	/**
	 * 处理http响应
	 *
	 * @param httpResponse
	 */
	private static String executeResponse(CloseableHttpResponse httpResponse) throws IOException {
		StatusLine statusLine = httpResponse.getStatusLine();

		HttpEntity responseEntity = httpResponse.getEntity();
		String resp = EntityUtils.toString(httpResponse.getEntity(), DEFAULT_CHARSET);
		EntityUtils.consume(responseEntity);

		if (statusLine.getStatusCode() == 200) {
			return resp;
		} else {
			throw new RuntimeException("http响应错，状态码：" + statusLine.getStatusCode());
		}
	}

	/**
	 * 关闭CloseableHttpResponse
	 *
	 * @param response
	 */
	private static void close(CloseableHttpResponse response) {
		if (response != null) {
			try {
				response.close();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException(e.getMessage());
			}
		}
	}

	public static String sendHttpsPost(String url, String params){
		DataOutputStream out = null;
		BufferedReader in = null;
		StringBuffer result = new StringBuffer();
		URL u = null;
		HttpsURLConnection con = null;
		//尝试发送请求
		try{
//			System.out.println(params);
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, new TrustManager[] { new TrustAnyTrustManager() },
					new java.security.SecureRandom());
			u = new URL(url);
			//打开和URL之间的连接
			con = (HttpsURLConnection)u.openConnection();
			//设置通用的请求属性
			con.setSSLSocketFactory(sc.getSocketFactory());
			con.setHostnameVerifier(new TrustAnyHostnameVerifier());
			//con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json"); //
			con.setUseCaches(false);
			//发送POST请求必须设置如下两行
			con.setDoOutput(true);
			con.setDoInput(true);

			con.connect();
			out = new DataOutputStream(con.getOutputStream());
			out.write(params.getBytes("utf-8"));
			// 刷新、关闭
			out.flush();
			out.close();
			//读取返回内容
			//InputStream is = con.getInputStream();
			//定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
			String line;
			while((line = in.readLine()) != null) {
				result.append(line).append(System.lineSeparator());
			}
//			System.out.println(result);
			return result.toString();
		}catch(Exception e){
			e.printStackTrace();
		}
		//使用finally块来关闭输出流、输入流
		finally {
			try{
				if(out!=null){
					out.close();
				}
				if(in!=null){
					in.close();
				}
				if(con != null) {
					con.disconnect();
				}
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
		}
		return result.toString();
	}

	private static class TrustAnyTrustManager implements X509TrustManager {

		public void checkClientTrusted(X509Certificate[] chain, String authType)
				throws CertificateException {
		}

		public void checkServerTrusted(X509Certificate[] chain, String authType)
				throws CertificateException {
		}

		public X509Certificate[] getAcceptedIssuers() {
			return new X509Certificate[] {};
		}

	}

	private static class TrustAnyHostnameVerifier implements HostnameVerifier {
		public boolean verify(String hostname, SSLSession session) {
			return true;
		}
	}

}
