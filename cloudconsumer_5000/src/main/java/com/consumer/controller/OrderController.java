package com.consumer.controller;

import com.consumer.entity.CommonResult;
import com.consumer.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author includeno
 * @since 2021/2/11
 */
@Slf4j
@RestController
public class OrderController {

    //zookeeper cli-> ls /services  -> cloudpayment
    //consul spring.cloud.consul.discovery.service-name=cloudpayment
    public static final String CONSUL_PAYMENT_URL="http://cloudpayment";//需要去RestTemplate bean添加负载均衡 java.net.UnknownHostException: CLOUDPAYMENT8000
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/produce")
    public CommonResult<Payment> create(Payment payment){
        System.out.println("发送的payment"+payment);
        return restTemplate.postForObject(CONSUL_PAYMENT_URL+"/payment",payment,CommonResult.class);
    }

    @GetMapping("/consume")
    public CommonResult<Payment> getPayment(Integer id){
        System.out.println(id);

        Map<String, Integer> params = new HashMap<String, Integer>();
        params.put("id", id);
        return restTemplate.getForObject(CONSUL_PAYMENT_URL+"/payment?id={id}",CommonResult.class,params);
    }

}
