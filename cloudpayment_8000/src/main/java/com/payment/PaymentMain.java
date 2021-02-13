package com.payment;

/**
 * @author includeno
 * @since 2021/2/11
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.payment.dao")
@EnableEurekaClient
//添加服务至eureka #客户端步骤3
public class PaymentMain {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain.class, args);
    }

}