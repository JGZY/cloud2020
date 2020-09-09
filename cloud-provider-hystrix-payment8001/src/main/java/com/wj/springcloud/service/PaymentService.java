package com.wj.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author wen.jie
 * @Classname PaymentService
 * @Description TODO
 * @Date 2020/9/5
 */
@Service
public class PaymentService {

    public String paymentInfoOk(Integer id){
        return "线程池:"+Thread.currentThread().getName()+"  paymentInfoOk"+":"+id;
    }

    /**
     * @Author wen.jie
     * @Description fallbackMethod中定义了回调方法
     *              HystrixProperty中定义了超时时间
     * @Date 2020/9/6 13:00
     **/
/*    @HystrixCommand(fallbackMethod = "paymentInfo_Handler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "13000")
    })*/
    public String paymentInfoTimeOut(Integer id){
        int time = 3;
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池:"+Thread.currentThread().getName()+"  paymentInfoTimeOut"+":"+id;
    }

    /**
     * @Author wen.jie
     * @Description 服务降级的fallback方法
     * @Date 2020/9/6 12:58
     **/
    public String paymentInfo_Handler(Integer id){
        return "线程池:"+Thread.currentThread().getName()+"  paymentInfoTimeOut"+":"+id+"=====hystrix-handler";
    }

    //========================服务熔断=====================
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),//失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(Integer id){
        if(id<0){
            throw new RuntimeException("id<0");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName()+"\t"+"调用成功,流水号:"+serialNumber;
    }

    public String paymentCircuitBreaker_fallback(Integer id){
        return "id<0"+":"+id;
    }
}
