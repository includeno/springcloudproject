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

/**
 * @author includeno
 * @since 2021/2/11
 */
@Slf4j
@RestController
public class OrderController {

    public static final String PAYMENT_URL="http://localhost:8000";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/produce")
    public CommonResult<Payment> create(Payment payment){
        System.out.println("发送的payment"+payment);
        return restTemplate.postForObject(PAYMENT_URL+"/payment",payment,CommonResult.class);
    }

    @GetMapping("/consume")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment"+"/id",CommonResult.class);
    }

}
