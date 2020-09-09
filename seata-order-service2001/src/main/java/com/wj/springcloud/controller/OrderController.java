package com.wj.springcloud.controller;

import com.wj.springcloud.domain.Order;
import com.wj.springcloud.entities.CommonResult;
import com.wj.springcloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wen.jie
 * @Classname OrdeController
 * @Description TODO
 * @Date 2020/9/9
 */
@Slf4j
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult createOrder(Order order){
        orderService.create(order);
        return new CommonResult(200,"创建成功");
    }
}
