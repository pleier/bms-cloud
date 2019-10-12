package com.github.plei.common.core.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.*;

/**
 * redis配置类
 *
 * @author : pleier
 * @date : 2019/3/29
 */
@EnableCaching
@Configuration
public class RedisConfig {
    @Bean
    public RedisTemplate<String,String> redisTemplate(LettuceConnectionFactory lettuceConnectionFactory){
        StringRedisTemplate template = new StringRedisTemplate(lettuceConnectionFactory);
        return template;
    }
}
