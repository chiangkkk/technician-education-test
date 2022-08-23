package com.zzhy.common.core.domain;

import com.zzhy.common.core.page.ApiTableDataInfo;

import java.util.HashMap;

/**
 * 返回数据
 * 200表示成功，500表示失败，其他自定义异常
 * @author zjh
 * @date 2016年10月27日 下午9:59:27
 */
public class R extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public R() {
        put("code", 200);
    }

    public static R error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static R error(String msg) {
        return error(500, msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static R ok(String msg) {
        return ok(200,msg);
    }

//    public static R ok(Map<String, Object> map) {
//        R r = new R();
//        r.putAll(map);
//        return r;
//    }

    public static R ok() {
        return ok(200,"操作成功");
    }


    public static R ok(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    /**
     * 初始化一个新创建的 R 对象
     *
     * @param code 状态码
     * @param msg 返回内容
     * @param data 数据对象
     */
    public static R ok(int code, String msg, Object data)
    {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        r.put("data",data);
        return r;

    }

    /**
     * 初始化一个新创建的 R 对象
     * @param data 数据对象
     */
    public static R ok(Object data)
    {
        return ok(200,"操作成功",data);

    }

    /**
     * 返回分页返回数据
     * @param dataTable
     * @return
     */
    public static R okList(ApiTableDataInfo dataTable) {
        R r = new R();
        r.put("code", 200);
        r.put("msg", "操作成功");
        r.put("data",dataTable);
        return r;
    }


    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }


}
