package com.wj.springcloud.controller;

import com.wj.springcloud.entities.CommonResult;
import com.wj.springcloud.entities.Payment;
import com.wj.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author wen.jie
 * @Classname PaymentController
 * @Description TODO
 * @Date 2020/9/4
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        if(result>0){
            return new CommonResult<>(200,"插入成功",result);
        }else{
            return new CommonResult<>(444,"插入失败",null);
        }

    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Long id){
        Payment payment = paymentService.getPaymentById(id);
        if(payment!=null){
            return new CommonResult<>(200,"查询成功+"+serverPort,payment);
        }else{
            return new CommonResult<>(444,"查询失败+"+serverPort,null);
        }

    }

}
