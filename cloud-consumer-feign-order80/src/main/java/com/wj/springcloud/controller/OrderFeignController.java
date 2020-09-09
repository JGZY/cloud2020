package com.wj.springcloud.controller;

import com.wj.springcloud.entities.CommonResult;
import com.wj.springcloud.entities.Payment;
import com.wj.springcloud.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wen.jie
 * @Classname OrderFeignController
 * @Description TODO
 * @Date 2020/9/5
 */
@RestController
public class OrderFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Long id){
        return  paymentFeignService.getPaymentById(id);

    }
}
