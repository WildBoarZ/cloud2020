package com.zhang.springcloud.dao;

import com.zhang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName : PaymentDao
 * @Description :
 * @since: 1.14.1
 * @Author : zhanglei
 * @Date: 2020-09-03 19:39
 */
@Mapper
public interface PaymentDao {

    public int createPayment(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
