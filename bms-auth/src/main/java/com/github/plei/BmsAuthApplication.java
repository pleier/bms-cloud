package com.github.plei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 授权认证中心
 *
 * @author : pleier
 * @date : 2019/1/9
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.github.plei.dao")
public class BmsAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(BmsAuthApplication.class, args);
    }
}
