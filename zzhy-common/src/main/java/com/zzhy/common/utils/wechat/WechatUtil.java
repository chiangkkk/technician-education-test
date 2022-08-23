package com.zzhy.common.utils.wechat;

import com.alibaba.fastjson.JSONObject;
import com.zzhy.common.utils.JsonUtil;
import com.zzhy.common.utils.http.HttpUtils;
import com.zzhy.common.utils.uuid.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * 微信共用类
 */
public class WechatUtil {

    private static final Logger log = LoggerFactory.getLogger(WechatUtil.class);

    /**
     * 获取access_token
     */
    public static JSONObject getAccessToken(String appId, String secret){
        String url = "https://api.weixin.qq.com/cgi-bin/token";
        Map<String,String> paramMap = new HashMap<>();
        paramMap.put("grant_type", "client_credential");
        paramMap.put("appid", appId);
        paramMap.put("secret", secret);
        String params = null;
        try {
            params = ParameterUtils.payParamsToString(paramMap);
        } catch (UnsupportedEncodingException e) {
            log.error("格式转化异常");
            e.printStackTrace();
        }
        JSONObject jsonObject = JSONObject.parseObject(HttpUtils.sendGet(url, params, "UTF-8"));
        return jsonObject;

    }

    /**
     * 业务方上传用户姓名和身份证，获取用户凭证，把凭证给到前端通过 jsapi 调用
     */
    public static JSONObject getuseridkey(String studentName, String certificateNum,String accessToken){
        String url = "https://api.weixin.qq.com/cityservice/face/identify/getuseridkey?access_token="+accessToken;
//        JSONObject params = new JSONObject();
//        params.put("name", studentName);
//        params.put("id_card_number", certificateNum);
//        JSONObject jsonObject = JSONObject.parseObject(HttpUtils.httpPost(url, params));
        Map<String,String> paramMap = new HashMap<>();
        paramMap.put("name", studentName);
        paramMap.put("id_card_number", certificateNum);
        String params = JsonUtil.getJsonByObj(paramMap);
        log.info("实名认证请求参数："+params);
        JSONObject jsonObject = JSONObject.parseObject(HttpUtils.sendPost(url, params));

        return jsonObject;

    }

    /**
     * 人脸核身之后，开发者可以根据jsapi返回的verify_result向后台拉取当次认证的结果信息。
     */
    public static JSONObject getinfo(String verifyResult,String accessToken){
        String url = "https://api.weixin.qq.com/cityservice/face/identify/getinfo?access_token="+accessToken;
        Map<String,String> paramMap = new HashMap<>();
        paramMap.put("verify_result", verifyResult);
        String params = JsonUtil.getJsonByObj(paramMap);
        JSONObject jsonObject = JSONObject.parseObject(HttpUtils.sendPost(url, params));
        return jsonObject;

    }


    /**
     * 获取access_token
     */
    public static JSONObject getOpenId(String appId, String secret,String code){
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        Map<String,String> paramMap = new HashMap<>();
        paramMap.put("appid", appId);
        paramMap.put("secret", secret);
        paramMap.put("js_code", code);
        paramMap.put("grant_type", "authorization_code");
        String params = null;
        try {
            params = ParameterUtils.payParamsToString(paramMap);
        } catch (UnsupportedEncodingException e) {
            log.error("格式转化异常");
            e.printStackTrace();
        }
        JSONObject jsonObject = JSONObject.parseObject(HttpUtils.sendGet(url, params, "UTF-8"));
        return jsonObject;

    }

    /**
     * 获取PC access_token
     */
    public static JSONObject PcGetOpenId(String appId, String secret,String code){
        String url = "https://api.weixin.qq.com/sns/oauth2";
        Map<String,String> paramMap = new HashMap<>();
        paramMap.put("appid", appId);
        paramMap.put("secret", secret);
        paramMap.put("code", code);
        paramMap.put("grant_type", "authorization_code");
        String params = null;
        try {
            params = ParameterUtils.payParamsToString(paramMap);
        } catch (UnsupportedEncodingException e) {
            log.error("格式转化异常");
            e.printStackTrace();
        }
        JSONObject jsonObject = JSONObject.parseObject(HttpUtils.sendGet(url, params, "UTF-8"));
        return jsonObject;

    }


    /**
     * 获取手机号
     */
    public static JSONObject getPhone(String phoneCode,String accessToken){
        String url = "https://api.weixin.qq.com/wxa/business/getuserphonenumber?access_token="+accessToken;
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", phoneCode);
        return JSONObject.parseObject(HttpUtils.httpPost(url, jsonObject));

    }


    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
//        String appId = "wxcc4d15d7b1e979b0";
//        String secret = "fc52f67c4592498f34b6a5fdf53d1e5c";
//        String phcode = "9115cc895e8de53a3d2b44081cb17b1d4ddddb2fec2c8ca8f92d9b7447ec9e03";
//        JSONObject jsonObject = getAccessToken(appId,secret);
////        System.out.println(jsonObject.toString());
//        String name = "xxx";
//        String certificateNum = "xxxxx";
//        String accessToken = "56_iJ-SVg3JpFJpMoYzNBx4bYgBUHs2SEeL-cJGWb6XRq0g-ZU4dwkh6tfLMf1nK-uKpGWSYcrjAXnLmltIS3yGqhEAhmcxeuoOEVbd9dd-RbtMxcXcG4i2IRaC3D_BWBW2UsodPgUgF9RH2551LQCiADABGS";
//        JSONObject jsonObject = getuseridkey(name,certificateNum,accessToken);
//        System.out.println(JsonUtil.getJsonByObj(jsonObject));
//
////        JSONObject phone = getPhone(phcode,"56_seyrfoMQAAoVH3ipnXzas7D7FXDSYFnq-Gr7aRFjTYmuHDHNGJzC3J_pmtOdvxBM-Nq8mfKibH90YkxUBEZBJUCAXMH5mS4dJ5I3HnXeAmCBG_jcMJsRxaZCGfD_F6RpgAhXHJ24LG4E8IDiMIBgAAAUQJ");
//        System.out.println("phone = " + jsonObject);
//        JSONObject jsonObject = JSONObject.parseObject("{\"errcode\":0,\"errmsg\":\"ok\",\"phone_info\":{\"phoneNumber\":\"15906007519\",\"watermark\":{\"appid\":\"wxcc4d15d7b1e979b0\",\"timestamp\":1651753230},\"purePhoneNumber\":\"15906007519\",\"countryCode\":\"86\"}}");
//        JSONObject phone_info = jsonObject.getJSONObject("phone_info");
//        System.out.println("phone_info = " + phone_info);
//        String phoneNumber = phone_info.getString("phoneNumber");
//        System.out.println(phoneNumber);

    }


    /**
     * 院校端二维码
     * @param appId
     * @param secret
     * @param keyValue
     * @param accessToken
     * @return
     */
    public static Map<String, Object> getQRcode(String appId, String secret, String keyValue ,String accessToken)
    {
        if (accessToken != null)
        {
            String url = "https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token=" + accessToken;
            JSONObject jsonParam = new JSONObject();
            jsonParam.put("scene", keyValue);
	        jsonParam.put("page", "pages/pc/index");
	        log.info("二维码请求参数"+jsonParam.toJSONString());
//		    jsonParam.put("width", "500");
//            jsonParam.put("height", "500");
            return HttpUtils.URLPostJSON(url, jsonParam.toJSONString(), "UTF-8");
        }
        return null;
    }



}
