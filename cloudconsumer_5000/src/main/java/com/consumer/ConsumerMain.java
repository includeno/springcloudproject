package com.consumer;

/**
 * @author includeno
 * @since 2021/2/11
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


//不添加@EnableEurekaClient注解则报错:c.n.d.s.t.d.RedirectingEurekaHttpClient  : Request execution error. endpoint=DefaultEndpoint{ serviceUrl='http://localhost:8761/eureka/}, exception=java.net.ConnectException: Connection refused: no further information stacktrace=com.sun.jersey.api.client.ClientHandlerException: java.net.ConnectException: Connection refused: no further information
//端口号如果是8671,说明客户端 eureka.client.serviceUrl.defaultZone=配置错误 或者 服务器eureka.client.service-url.defaultZone配置错误
@SpringBootApplication
@EnableDiscoveryClient//zookeeper
public class ConsumerMain {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain.class, args);
    }

}