package com.wj.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wj.springcloud.service.PaymentHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wen.jie
 * @Classname OrderHystrixController
 * @Description TODO
 * @Date 2020/9/5
 */
@RestController
//@DefaultProperties(defaultFallback = "paymentIfo_Global_Handler")
public class OrderHystrixController {
    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfoOk(@PathVariable Integer id)
    {
        return paymentHystrixService.paymentInfoOk(id);
    }

    //@HystrixCommand
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfoTimeout(@PathVariable Integer id)
    {
        return paymentHystrixService.paymentInfoTimeout(id);
    }

    /**
     * @Author wen.jie
     * @Description 服务降级的fallback方法
     * @Date 2020/9/6 12:58
     **/
    public String paymentInfo_Handler(Integer id){
        return "线程池:"+Thread.currentThread().getName()+"  paymentInfoTimeOut"+":"+id+"=====hystrix-handler-order";
    }

    public String paymentIfo_Global_Handler(){
        return "线程池:"+Thread.currentThread().getName()+"=====hystrix-handler-order-global";
    }
}
