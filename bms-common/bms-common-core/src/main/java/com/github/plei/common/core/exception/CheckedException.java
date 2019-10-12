package com.github.plei.common.core.exception;

import lombok.NoArgsConstructor;

/**
 * 检查异常
 *
 * @author : pleier
 * @date : 2019/3/29
 */
@NoArgsConstructor
public class CheckedException extends RuntimeException {
    private static final long serialVersionUID = -4643968286581894652L;
    
    public CheckedException(String message) {
        super(message);
    }
    
    public CheckedException(Throwable cause) {
        super(cause);
    }
    
    public CheckedException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public CheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
