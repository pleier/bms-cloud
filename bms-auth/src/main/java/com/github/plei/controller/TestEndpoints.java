package com.github.plei.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.plei.entity.SysUser;
import com.github.plei.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : pleier
 * @date : 2019/2/25
 */
@RestController
@RefreshScope
public class TestEndpoints {
    @Autowired
    private SysUserService sysUserService;

    @Value("${wokao.test}")
    private String aaa;
    @PostMapping("/product/{id}")
    public String getProduct(@PathVariable String id) {
        SysUser user = sysUserService.getOne(Wrappers.<SysUser>query()
                .lambda().eq(SysUser::getUserName, id));
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "product id : " + id;
    }

    @PostMapping("/order/{id}")
    public String getOrder(@PathVariable String id) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "order id : " + aaa;
    }
}
