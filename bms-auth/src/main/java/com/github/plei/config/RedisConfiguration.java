package com.github.plei.config;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author : pleier
 * @date : 2019/2/26
 */
@Configuration
public class RedisConfiguration extends CachingConfigurerSupport {
    @Bean
    public RedisTemplate<String,String> redisTemplate(LettuceConnectionFactory lettuceConnectionFactory){
        StringRedisTemplate template = new StringRedisTemplate(lettuceConnectionFactory);
        return template;
    }
}
