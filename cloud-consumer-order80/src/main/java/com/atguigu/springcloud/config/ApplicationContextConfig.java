package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @auther lgl
 * @date 2022/5/19 23:08
 * @description: 配置类
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //@LoadBlanced赋予了RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
