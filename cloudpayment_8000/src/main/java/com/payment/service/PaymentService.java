package com.payment.service;

import com.payment.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @author includeno
 * @since 2021/2/11
 */

public interface PaymentService {
    //insert
    public int create(Payment payment);
    //select
    public Payment getPaymentById(@Param("id")Long id);
}
