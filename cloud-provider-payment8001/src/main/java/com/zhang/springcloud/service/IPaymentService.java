package com.zhang.springcloud.service;

import com.zhang.springcloud.entities.Payment;

/**
 * @ClassName : IPaymentService
 * @Description :
 * @since: 1.14.1
 * @Author : zhanglei
 * @Date: 2020-09-03 19:39
 */

public interface IPaymentService {
    public int createPayment(Payment payment);

    public Payment getPaymentById(Long id);
}
