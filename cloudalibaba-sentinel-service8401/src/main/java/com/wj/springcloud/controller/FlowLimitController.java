package com.wj.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author wen.jie
 * @Classname FlowLimitController
 * @Description TODO
 * @Date 2020/9/9
 */
@Slf4j
@RestController
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return "testA";
    }

    @GetMapping("/testB")
    public String testB(){
        return "testB";
    }

    @GetMapping("/testD")
    public String testD() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("testD 测试RT");
        return "testD";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler ="handler_hotKey" )
    public String testHotKey(String p1,String p2){
        return "testHotKey";
    }

    public String handler_hotKey(String p1, String p2, BlockException e){
        return "handler_hotKey";
    }
}
