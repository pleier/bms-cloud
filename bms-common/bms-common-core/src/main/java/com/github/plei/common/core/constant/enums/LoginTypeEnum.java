package com.github.plei.common.core.constant.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 登录类型
 *
 * @author : pleier
 * @date : 2019/3/29
 */
@Getter
@AllArgsConstructor
public enum LoginTypeEnum {
    /**
     * 账号密码登录
     */
    PWD("PWD", "账号密码登录"),
    
    /**
     * QQ登录
     */
    QQ("QQ", "QQ登录"),
    
    /**
     * 微信登录
     */
    WECHAT("WX", "微信登录");
    
    /**
     * 类型
     */
    private final String type;
    /**
     * 描述
     */
    private final String description;
}
