package com.zhang.springcloud.service.impl;

import com.zhang.springcloud.dao.PaymentDao;
import com.zhang.springcloud.entities.Payment;
import com.zhang.springcloud.service.IPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName : PaymentImpl
 * @Description :
 * @since: 1.14.1
 * @Author : zhanglei
 * @Date: 2020-09-03 19:39
 */
@Service
public class PaymentImpl implements IPaymentService {

    @Resource
    private PaymentDao paymentDao;


    @Override
    public int createPayment(Payment payment) {
        return paymentDao.createPayment(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
