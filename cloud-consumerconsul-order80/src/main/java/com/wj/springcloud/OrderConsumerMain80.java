package com.wj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wen.jie
 * @Classname OrderMain80
 * @Description TODO
 * @Date 2020/9/4
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsumerMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderConsumerMain80.class,args);
    }

}
