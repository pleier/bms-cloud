package com.github.plei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author : pleier
 * @date : 2018/12/21
 */
@EnableEurekaServer
@SpringBootApplication
public class BmsEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(BmsEurekaApplication.class,args);
    }
}
