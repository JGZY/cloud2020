package com.wj.springcloud.controller;

import com.wj.springcloud.entities.CommonResult;
import com.wj.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wen.jie
 * @Classname PaymentController
 * @Description TODO
 * @Date 2020/9/4
 */
@Slf4j
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/get/{id}")
    public CommonResult<Payment> getById(@PathVariable Long id){
        return new CommonResult<>(200,"成功",new Payment(1L,"hahah"));
    }

    @RequestMapping("/payment/zk")
    public String paymentZk(){
        return  serverPort;
    }
}
