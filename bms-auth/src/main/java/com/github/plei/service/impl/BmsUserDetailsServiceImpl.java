package com.github.plei.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.plei.entity.SysUser;
import com.github.plei.entity.UserInfo;
import com.github.plei.service.SysUserService;
import com.github.plei.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : pleier
 * @date : 2019/2/27
 */
public class BmsUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private UserInfoService userInfoService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        SysUser user = sysUserService.getOne(Wrappers.<SysUser>query()
                .lambda().eq(SysUser::getUserName, userName));
        UserInfo userInfo = null;
        if (null!=user){
            userInfo = userInfoService.findUserInfo(user);
        }

        UserDetails userDetails = getUserDetails(userInfo);
        return userDetails;
    }

    private UserDetails getUserDetails(UserInfo userInfo){
        if (userInfo == null || userInfo.getSysUser()==null) {
            throw new UsernameNotFoundException("用户不存在");
        }
        Set<String> dbAuthsSet = new HashSet<>();
        dbAuthsSet.add("admin");
        Collection<? extends GrantedAuthority> authorities
                = AuthorityUtils.createAuthorityList(dbAuthsSet.toArray(new String[0]));
        SysUser user = userInfo.getSysUser();
        return new User(user.getUserName(),user.getPassword(),true,true,true,true,authorities);
    }
}
