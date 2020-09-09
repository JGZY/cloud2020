package com.wj.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author wen.jie
 * @Classname PaymentFallBackService
 * @Description TODO
 * @Date 2020/9/6
 */
@Component
public class PaymentFallBackService implements PaymentHystrixService {
    @Override
    public String paymentInfoOk(Integer id) {
        return "PaymentFallBackService--fallback";
    }

    @Override
    public String paymentInfoTimeout(Integer id) {
        return "PaymentFallBackService--fallback";
    }
}
