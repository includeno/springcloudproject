package com.eurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author includeno
 * @since 2021/2/12
 */
@SpringBootApplication
@EnableEurekaServer//注册中心需要加上 #服务器步骤1
public class EurekaMain {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain.class,args);
    }
}
