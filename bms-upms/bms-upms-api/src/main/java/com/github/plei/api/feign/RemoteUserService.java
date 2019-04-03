package com.github.plei.api.feign;

import com.github.plei.api.dto.UserInfo;
import com.github.plei.api.feign.factory.RemoteUserServiceFallbackFactory;
import com.github.plei.common.core.constant.SecurityConstants;
import com.github.plei.common.core.constant.ServiceNameConstants;
import com.github.plei.common.core.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * @author : pleier
 * @date : 2019/3/29
 */
@FeignClient(value = ServiceNameConstants.UMPS_SERVICE, fallbackFactory = RemoteUserServiceFallbackFactory.class)
public interface RemoteUserService {

    /**
     * 通过用户名查询用户、角色信息
     *
     * @param username 用户名
     * @param from     调用标志
     * @return R
     */
    @GetMapping("/user/info/{username}")
    R<UserInfo> info(@PathVariable("username") String username
            , @RequestHeader(SecurityConstants.FROM) String from);

    /**
     * 通过社交账号查询用户、角色信息
     *
     * @param inStr appid@code
     * @return
     */
    @GetMapping("/social/info/{inStr}")
    R<UserInfo> social(@PathVariable("inStr") String inStr);
}
