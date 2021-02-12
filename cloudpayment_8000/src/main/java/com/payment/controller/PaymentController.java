package com.payment.controller;

import com.payment.entity.CommonResult;
import com.payment.entity.Payment;
import com.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author includeno
 * @since 2021/2/11
 */
@Slf4j
@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;


    @PostMapping("/payment")
    public CommonResult create(HttpServletRequest request,@RequestBody Payment payment){
        String id=request.getParameter("id");
        System.out.println("request.getParameter id:"+id);
        System.out.println("接收到的payment"+payment);
        int result=paymentService.create(payment);
        log.info("结果是",result);
        if(result>0){
            return new CommonResult(200,"插入数据库成功",result);
        }
        else {
            return new CommonResult(444,"插入数据库失败");
        }
    }

    @GetMapping("/payment")
    public CommonResult getPaymentById(Long id){
        Payment result=paymentService.getPaymentById(id);
        log.info("结果是",result);
        if(result!=null){
            return new CommonResult(200,"查询成功",result);
        }
        else {
            return new CommonResult(444,"查询失败");
        }
    }
}
