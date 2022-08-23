package com.zzhy.common.utils.wechat;

import org.apache.commons.lang3.StringUtils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.*;

/**
 * md5加密相关
 * @author user
 *
 */
public class ParameterUtils {

	public static String getRequestQueryString(Map<String, String> params, String mkey) {

		Map<String, String> resultMap = sortMapByKey(params); // 按Key进行排序

		StringBuffer buffer = new StringBuffer();
		for (Iterator<String> it = resultMap.keySet().iterator(); it.hasNext();) {
			String key = it.next();
			if (StringUtils.equals("sign", key) || StringUtils.equalsIgnoreCase("callback", key)) {
				continue;
			}
			if (resultMap.get(key) == null) {
				continue;
			}
			buffer.append(key + "=" + resultMap.get(key) + "&");
		}

		return buffer.substring(0, buffer.length() - 1) + mkey;
	}

	/**
	 * 使用 Map按key进行排序
	 * 
	 * @param map
	 * @return
	 */
	public static Map<String, String> sortMapByKey(Map<String, String> map) {
		if (map == null || map.isEmpty()) {
			return null;
		}

		Map<String, String> sortMap = new TreeMap<String, String>(new MapKeyComparator());

		sortMap.putAll(map);

		return sortMap;
	}

	/**
	 * 将bean对象转化为map
	 * 
	 * @param obj
	 * @return
	 */
	public static SortedMap<String, String> transBean2Map(Object obj) {
		if (obj == null) {
			return null;
		}
		SortedMap<String, String> map = new TreeMap<String, String>();
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
			PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor property : propertyDescriptors) {
				String key = property.getName();
				// 过滤class属性
				if (!key.equals("class")) {
					// 得到property对应的getter方法
					Method getter = property.getReadMethod();
					Object value = getter.invoke(obj);

					if("fee".equals(key)){
						map.put(key, "");
					}else if (value != null) {
						map.put(key, value.toString());
					}
				}
			}
		} catch (Exception e) {
			System.out.println("transBean2Map Error " + e);
		}

		return map;

	}

	/**
	 * 表单数据转map
	 * 
	 * @param params
	 * @return
	 */
	public static Map<String, String> paramsToMap(String params) {
		Map<String, String> map = new LinkedHashMap<String, String>();
		if (params != null && !params.equals("")) {
			String[] array = params.split("&");
			for (String pair : array) {
				if ("=".equals(pair.trim())) {
					continue;
				}
				String[] entity = pair.split("=");
				if (entity.length == 1) {
					map.put(decode(entity[0]), null);
				} else {
					map.put(decode(entity[0]), decode(entity[1]));
				}
			}
		}
		return map;
	}

	public static String decode(String content) {
		try {
			return URLDecoder.decode(content, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return "";
	}
	/**
	 * map 转对象
	 * @param map
	 * @param beanClass
	 * @return
	 * @throws Exception
	 */
	public static Object mapToObject(Map<String, String> map, Class<?> beanClass) throws Exception {
		if (map == null)
			return null;

		Object obj = beanClass.newInstance();

		BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor property : propertyDescriptors) {
			Method setter = property.getWriteMethod();
			if (setter != null) {
				setter.invoke(obj, map.get(property.getName()));
			}
		}

		return obj;
	}
	/**
	 * 将map 使用&拼接  进行首字母排序
	 * 
	 * @param payParams
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String payParamsToStringSort(Map<String, String> payParams) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		List<String> keys = new ArrayList<String>(payParams.keySet());
		Collections.sort(keys);
		for (String key : keys) {
			sb.append(key).append("=");
//			sb.append(URLEncoder.encode(payParams.get(key), "UTF-8"));
			sb.append(payParams.get(key));
			sb.append("&");
		}
		sb.setLength(sb.length() - 1);
		return sb.toString();
	}


	/**
	 * 将map 使用&拼接 不进行首字母排序
	 *
	 * @param payParams
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String payParamsToString(Map<String, String> payParams) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		List<String> keys = new ArrayList<String>(payParams.keySet());
		for (String key : keys) {
			sb.append(key).append("=");
//			sb.append(URLEncoder.encode(payParams.get(key), "UTF-8"));
			sb.append(payParams.get(key));
			sb.append("&");
		}
		sb.setLength(sb.length() - 1);
		return sb.toString();
	}

	/**
	 * 使用 Map按key进行排序
	 *
	 * @param map
	 * @return
	 */
	public static String sortMapByKeyValStr(Map<String, String> map) {
		StringBuilder sb = new StringBuilder();
		if (map == null || map.isEmpty()) {
			return null;
		}
		Map<String, String> loweMap = new HashMap<>();
		Set<String> keySet = map.keySet();
		for (String key : keySet)
		{
			String newKey = key.toLowerCase();
			loweMap.put(newKey, map.get(key));
		}
		Map<String, String> sortMap = new TreeMap<String, String>(new MapKeyComparator());

		sortMap.putAll(loweMap);

		List<String> values =  new ArrayList<String>(sortMap.values());
		for(String val : values){
			if(StringUtils.isNotEmpty(val)){
				sb.append(val);
			}
		}

		return sb.toString();
	}

}