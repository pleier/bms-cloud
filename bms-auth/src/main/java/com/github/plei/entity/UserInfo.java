package com.github.plei.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : pleier
 * @date : 2019/2/27
 */
@Data
public class UserInfo implements Serializable {

    /**
     * 用户基本信息
     */
    private SysUser sysUser;

    /**
     * 权限集合
     */
    private String[] permissions;

    /**
     * 角色集合
     */
    private Long[] roles;
}
