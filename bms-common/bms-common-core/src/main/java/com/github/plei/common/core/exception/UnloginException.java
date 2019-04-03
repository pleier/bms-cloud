package com.github.plei.common.core.exception;

/**
 * 未登录
 *
 * @author : pleier
 * @date : 2019/3/29
 */
public class UnloginException extends RuntimeException {
    private static final long serialVersionUID = -6933990052484276771L;

    public UnloginException(String message) {
        super(message);
    }

    public UnloginException(Throwable cause) {
        super(cause);
    }

    public UnloginException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnloginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
