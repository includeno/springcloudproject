package com.payment.dao;

import com.payment.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author includeno
 * @since 2021/2/11
 */
//@Mapper
@Component
public interface PaymentDao {
    //insert
    public int create(Payment payment);
    //select
    public Payment getPaymentById(Integer id);
}
