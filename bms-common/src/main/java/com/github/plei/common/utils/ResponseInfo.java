package com.github.plei.common.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : pleier
 * @date : 2019/2/13
 */
public class ResponseInfo extends HashMap<String, Object> {
    private static final long serialVersionUID = -8203743128201538843L;

    public ResponseInfo() {
        put("code", 0);
    }

    public static ResponseInfo error(){
        return error(500, "未知异常，请联系管理员");
    }

    public static ResponseInfo error(String msg) {
        return error(500, msg);
    }

    public static ResponseInfo error(int code, String msg) {
        ResponseInfo r = new ResponseInfo();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static ResponseInfo ok(String msg) {
        ResponseInfo r = new ResponseInfo();
        r.put("msg", msg);
        return r;
    }

    public static ResponseInfo ok(Map<String, Object> map) {
        ResponseInfo r = new ResponseInfo();
        r.putAll(map);
        return r;
    }

    public static ResponseInfo ok() {
        return new ResponseInfo();
    }

    public static ResponseInfo ok(String key, Object value) {
        ResponseInfo r = new ResponseInfo();
        r.put(key, value);
        return r;
    }

    @Override
    public ResponseInfo put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
