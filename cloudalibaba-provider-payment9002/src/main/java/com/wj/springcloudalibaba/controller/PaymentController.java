package com.wj.springcloudalibaba.controller;

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
public class PaymentController {
    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/payment/nacos/{id}")
    public String echo(@PathVariable Integer id) {
        return "Hello Nacos Discovery :id ="+id+":port="+port;
    }
}
