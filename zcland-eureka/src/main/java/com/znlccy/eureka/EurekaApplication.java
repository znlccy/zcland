package com.znlccy.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName: EurekaApplication
 * FileName：EurekaApplication.java
 * Description：服务注册中心
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2019-12-30 10:25		create
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    /**
     * 启动函数
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
