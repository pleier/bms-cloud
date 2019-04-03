package com.github.plei.api.dto;

import com.github.plei.api.entity.SysUser;
import lombok.Data;

import java.io.Serializable;

/**
 * @author : pleier
 * @date : 2019/3/29
 */
@Data
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -5696313942979230811L;

    /**
     * 用户基本信息
     */
    private SysUser sysUser;
    /**
     * 权限标识集合
     */
    private String[] permissions;

    /**
     * 角色集合
     */
    private Integer[] roles;
}
