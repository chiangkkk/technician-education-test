package com.zzhy.common.utils;

import com.alibaba.fastjson.JSONObject;

public class ResultUtils {



    public static JSONObject results(boolean flag,String msg){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("flag",flag);
        if (!flag){
           if (StringUtils.isNotEmpty(msg)){
               jsonObject.put("msg",msg);
           }
        }
        return jsonObject;
    }

}
