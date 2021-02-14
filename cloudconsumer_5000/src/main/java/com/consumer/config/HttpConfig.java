package com.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author includeno
 * @since 2021/2/11
 */
@Configuration
public class HttpConfig {

    @Bean
    @LoadBalanced//java.net.UnknownHostException: CLOUDPAYMENT8000
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
