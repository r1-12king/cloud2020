package com.atguigu.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
/**
 * @version 1.0
 * @auther lgl
 * @date 2022/6/5 16:26
 * @description:
 */
@Configuration
@MapperScan({"com.atguigu.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
