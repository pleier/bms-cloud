package com.github.plei.common.core.exception;

import lombok.NoArgsConstructor;

/**
 * 403 授权拒绝
 *
 * @author : pleier
 * @date : 2019/3/29
 */
@NoArgsConstructor
public class BmsDeniedException extends RuntimeException {
    private static final long serialVersionUID = 8417549462159179044L;

    public BmsDeniedException(String message) {
        super(message);
    }

    public BmsDeniedException(Throwable cause) {
        super(cause);
    }

    public BmsDeniedException(String message, Throwable cause) {
        super(message, cause);
    }

    public BmsDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
