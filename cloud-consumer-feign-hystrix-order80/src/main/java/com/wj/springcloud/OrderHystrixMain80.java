package com.wj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wen.jie
 * @Classname OrderHystrixMain80
 * @Description TODO
 * @Date 2020/9/5
 */
@EnableFeignClients
@SpringCloudApplication
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class,args);
    }
}
