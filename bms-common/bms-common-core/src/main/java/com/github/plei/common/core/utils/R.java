package com.github.plei.common.core.utils;

import com.github.plei.common.core.constant.CommonConstants;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author : pleier
 * @date : 2019/2/13
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class R<T> implements Serializable {
    private static final long serialVersionUID = -8203743128201538843L;

    @Getter
    @Setter
    private int code = CommonConstants.SUCCESS;

    @Getter
    @Setter
    private String msg = "success";


    @Getter
    @Setter
    private T data;
    
    public static <T> R<T> ok() {
        return restResult(null, CommonConstants.SUCCESS, null);
    }
    
    public static <T> R<T> ok(T data) {
        return restResult(data, CommonConstants.SUCCESS, null);
    }
    
    public static <T> R<T> ok(T data, String msg) {
        return restResult(data, CommonConstants.SUCCESS, msg);
    }
    
    public static <T> R<T> failed() {
        return restResult(null, CommonConstants.FAIL, null);
    }
    
    public static <T> R<T> failed(String msg) {
        return restResult(null, CommonConstants.FAIL, msg);
    }
    
    public static <T> R<T> failed(T data) {
        return restResult(data, CommonConstants.FAIL, null);
    }
    
    public static <T> R<T> failed(T data, String msg) {
        return restResult(data, CommonConstants.FAIL, msg);
    }
    
    private static <T> R<T> restResult(T data, int code, String msg) {
        R<T> apiResult = new R<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }
}
