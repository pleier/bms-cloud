package com.github.plei.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.plei.dao.SysUserDao;
import com.github.plei.entity.SysUser;
import com.github.plei.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * @author : pleier
 * @date : 2019/2/27
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUser> implements SysUserService {
}
