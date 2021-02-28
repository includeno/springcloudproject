package com.payment.service;

import com.payment.dao.PaymentDao;
import com.payment.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author includeno
 * @since 2021/2/11
 */
@Service(value="PaymentService")
public class PaymentServiceImpl implements PaymentService{
    @Autowired
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentDao.getPaymentById(id);
    }
}
