package com.github.plei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author : pleier
 * @date : 2018/12/24
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class BmsConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(BmsConfigApplication.class,args);
    }
}
