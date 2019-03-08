package com.github.plei.service;

import com.github.plei.entity.SysUser;
import com.github.plei.entity.UserInfo;

/**
 * @author : pleier
 * @date : 2019/2/27
 */
public interface UserInfoService {

    /**
     * 获取用户明细
     *
     * @param sysUser 系统用户
     * @return
     */
    UserInfo findUserInfo(SysUser sysUser);
}
