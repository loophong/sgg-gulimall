package com.gulimall.gateway;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**

 1、开启网关服务注册发现 @EnableDiscoveryClient
 2、配置nacos注册中心地址
 3、配置路由规则 application.yml
 spring:
 datasource:
 gateway:
 routes:
 - id: test_baidu
 uri: https://www.baidu.com
 predicates:
 - Query=url,baidu
 */
@EnableDiscoveryClient
@MapperScan("com.gulimall.gateway.dao")
@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class,args);
    }
}
