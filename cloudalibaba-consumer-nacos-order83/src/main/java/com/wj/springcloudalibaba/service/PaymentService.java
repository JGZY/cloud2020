package com.wj.springcloudalibaba.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wen.jie
 * @Classname PaymentService
 * @Description TODO
 * @Date 2020/9/7
 */
@Component
@FeignClient("nacos-payment-provider")
public interface PaymentService {
    @GetMapping("/payment/nacos/{id}")
    public String getPaymentById(@PathVariable("id") Integer id);
}
