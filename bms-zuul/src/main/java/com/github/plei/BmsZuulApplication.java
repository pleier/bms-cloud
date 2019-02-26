package com.github.plei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author : pleier
 * @date : 2019/2/13
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class BmsZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(BmsZuulApplication.class,args);
    }
}
