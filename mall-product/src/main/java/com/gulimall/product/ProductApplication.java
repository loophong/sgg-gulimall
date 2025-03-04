package com.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * 1.整合mybatisPlus
 *  1)导入依赖
 *  2)配置
 *      配置数据源
 *          导入数据库驱动
 *          在application.yml配置数据源相关信息
 *      配置mybatisplus相关信息
 *          使用mapperscan
 *          告诉mybatisplus ,sql映射文件位置
 *          设置主键自增
 */

@EnableDiscoveryClient
@MapperScan("com.gulimall.product.dao")
@SpringBootApplication
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
    }
}
