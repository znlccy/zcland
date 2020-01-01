package com.znlccy.common.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * ClassName: MyBatisPlusConfig
 * FileName：MyBatisPlusConfig.java
 * Description：MyBatis Plus 配置类
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2019-12-31 10:29		create
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.znlccy.common.mapper")
public class MyBatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
