package com.wj.springcloud.service;

import com.wj.springcloud.domain.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author wen.jie
 * @Classname OrderService
 * @Description TODO
 * @Date 2020/9/9
 */
public interface OrderService {
    public void create(Order order);
}
