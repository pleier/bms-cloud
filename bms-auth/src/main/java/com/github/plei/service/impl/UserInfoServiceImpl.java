package com.github.plei.service.impl;

import com.github.plei.entity.SysUser;
import com.github.plei.entity.UserInfo;
import com.github.plei.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * @author : pleier
 * @date : 2019/2/27
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Override
    public UserInfo findUserInfo(SysUser sysUser) {
        UserInfo userInfo = new UserInfo();
        userInfo.setSysUser(sysUser);
        return userInfo;
    }
}
