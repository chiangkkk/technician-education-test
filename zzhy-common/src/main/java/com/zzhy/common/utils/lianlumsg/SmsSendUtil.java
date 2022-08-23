package com.zzhy.common.utils.lianlumsg;

import java.util.HashMap;
import java.util.Map;

/*
 * 通知-个性短信
 */
public class SmsSendUtil {

	// 接口版本号
	private static String Version = SmsConstants.Version;
	// 签名类型 固定值：MD5或者HMACSHA256
	private static String SignType = SmsConstants.MD5;
	// 短信码号扩展号，默认未开通
	private static String ExtendCode = "";
	// 固定值 1>普通短信；2>个性短信；3>模板短信


	//模板短信
	public static String sendTemplate(String mchId, String appId, String appkey, String templateId, String[] templateParamSet, String[] phoneNumberSet) throws Exception {
		String url = "https://api.shlianlu.com/sms/trade/template/send";
		Map<String, Object> requestData = new HashMap<String, Object>();
		requestData.put("MchId", mchId);
		requestData.put("AppId", appId);
		requestData.put("Version", Version);
		requestData.put("ExtendCode", ExtendCode);
		requestData.put("SignType", SignType);
		requestData.put("TimeStamp", String.valueOf(SmsSystemClock.now()));
		requestData.put("Type", "3");
		
		requestData.put("TemplateId", templateId);
		requestData.put("TemplateParamSet", templateParamSet);
		requestData.put("PhoneNumberSet", phoneNumberSet);
		requestData.put("Signature", SmsEncoder.generateSignature(requestData, appkey, SignType));
		String re = SmsRequest.requestOnce(url, appId, com.alibaba.fastjson.JSON.toJSONString(requestData), 10000, 10000);
		return re;
	}

	//个性化短信
	public static String sendPersonal(String mchId, String appId, String appkey, String signName, String[] sessionContextSet, String[][] contextParamSet) throws Exception {
		String url = "https://api.shlianlu.com/sms/trade/personal/send";
		Map<String, Object> requestData = new HashMap<String, Object>();
		requestData.put("MchId", mchId);
		requestData.put("AppId", appId);
		requestData.put("Version", Version);
		requestData.put("ExtendCode", ExtendCode);
		requestData.put("SignType", SignType);
		requestData.put("TimeStamp", String.valueOf(SmsSystemClock.now()));
		requestData.put("Type", "2");

		requestData.put("SignName", signName);
		requestData.put("SessionContextSet", sessionContextSet);
		requestData.put("ContextParamSet", contextParamSet);
		requestData.put("Signature", SmsEncoder.generateSignature(requestData, appkey, SignType));
		String re = SmsRequest.requestOnce(url, appId, com.alibaba.fastjson.JSON.toJSONString(requestData), 10000, 10000);
		return re;
	}

	//普通短信
	public static String sendNormal(String mchId, String appId, String appkey, String signName, String sessionContext, String[] phoneNumberSet) throws Exception {
		String url = "https://api.shlianlu.com/sms/trade/normal/send";
		Map<String, Object> requestData = new HashMap<String, Object>();
		requestData.put("MchId", mchId);
		requestData.put("AppId", appId);
		requestData.put("Version", Version);
		requestData.put("ExtendCode", ExtendCode);
		requestData.put("SignType", SignType);
		requestData.put("TimeStamp", String.valueOf(SmsSystemClock.now()));
		requestData.put("Type", "1");

		requestData.put("SignName", signName);
		requestData.put("SessionContext", sessionContext);
		requestData.put("PhoneNumberSet", phoneNumberSet);
		requestData.put("Signature", SmsEncoder.generateSignature(requestData, appkey, SignType));
		String re = SmsRequest.requestOnce(url, appId, com.alibaba.fastjson.JSON.toJSONString(requestData), 10000, 10000);
		return re;
	}
	
	public static void main(String[] args) throws Exception {
//		Map<String, Object> requestData = new HashMap<String, Object>();
//		requestData.put("MchId", "1003364");
//		requestData.put("AppId", "10011650598046097");
//		requestData.put("Version", Version);
//		requestData.put("ExtendCode", ExtendCode);
//		requestData.put("SignType", SignType);
//		requestData.put("TimeStamp", String.valueOf(SmsSystemClock.now()));
//		requestData.put("Type", "");
//
//		requestData.put("TemplateId", "70000278");
//		requestData.put("TemplateParamSet", new String[] {"111","222","222"});
//		requestData.put("PhoneNumberSet", new String[] { "15587571285","15587571285" });
//
//		requestData.put("Signature", SmsEncoder.generateSignature(requestData, "0cdbaafd0aae4ee38310e156422bc9a0", SignType));
		String mchId = "1003364";
		String appId = "10011650598046097";
		String appkey = "0cdbaafd0aae4ee38310e156422bc9a0";
		String signName = "【福建省技工院校服务】";
		String sessionContext = "这是一条测试短信，请忽略！";
		String[] PhoneNumberSet = new String[] { "13927464037" };
		long l = System.currentTimeMillis();
		String aa = sendNormal(mchId,appId,appkey,signName,sessionContext,PhoneNumberSet);

        System.out.println(aa);
        long end = System.currentTimeMillis() - l;
        System.out.println("com.alibaba.druid.support.json.JSONUtils.toJSONString用时:" +end + "ms");
	}
}
