package com.wj.springcloud.service;

import com.wj.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author wen.jie
 * @Classname PaymentService
 * @Description TODO
 * @Date 2020/9/4
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
