package com.wj.springcloud;

import com.wj.rule.MyRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author wen.jie
 * @Classname OrderMain80
 * @Description TODO
 * @Date 2020/9/4
 */
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MyRuleConfig.class)
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }

}
