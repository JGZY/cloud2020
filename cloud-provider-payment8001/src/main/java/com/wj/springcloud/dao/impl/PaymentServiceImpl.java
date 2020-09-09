package com.wj.springcloud.dao.impl;

import com.wj.springcloud.dao.PaymentDao;
import com.wj.springcloud.entities.Payment;
import com.wj.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wen.jie
 * @Classname PaymentImpl
 * @Description TODO
 * @Date 2020/9/4
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
