package com.wj.springcloudalibaba.controller;

import com.wj.springcloudalibaba.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wen.jie
 * @Classname PaymentController
 * @Description TODO
 * @Date 2020/9/7
 */

@RestController
public class OrderController {
    @Value("${server.port}")
    private String port;

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/order/nacos/{id}")
    public String echo(@PathVariable Integer id) {
        return paymentService.getPaymentById(id);
    }
}
