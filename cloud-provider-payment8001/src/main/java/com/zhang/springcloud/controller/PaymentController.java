package com.zhang.springcloud.controller;

import com.zhang.springcloud.entities.Payment;
import com.zhang.springcloud.result.CommonResult;
import com.zhang.springcloud.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @ClassName : PaymentController
 * @Description :
 * @since: 1.14.1
 * @Author : zhanglei
 * @Date: 2020-09-03 20:12
 */
@Controller
@Slf4j
public class PaymentController {
    @Resource
    private IPaymentService paymentService;

    @PostMapping(value = "/payment/createPayment")
    public CommonResult createPayment(Payment payment){
        CommonResult result = new CommonResult();
        try {
            int resultData = paymentService.createPayment(payment);
            log.info("######## 插入结果：{}", resultData);
            if (resultData > 0){
                result.setResult(200, "插入成功", resultData);
            }else {
                result.setResult(444, "插入失败", null);
            }
        }catch (Exception e){
            result.setResult(500, "异常", e.getMessage());
        }finally {

        }
        return result;
    }

    @ResponseBody
    @GetMapping(value = "/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        CommonResult result = new CommonResult();
        try {
            Payment resultData = paymentService.getPaymentById(id);
            log.info("######## 查询结果：{}", resultData);
            if (null != resultData){
                result.setResult(200, "查询成功", resultData);
            }else {
                result.setResult(444, "查询失败", null);
            }
        }catch (Exception e){
            result.setResult(500, "异常", e.getMessage());
        }finally {

        }
        return result;
    }
}
