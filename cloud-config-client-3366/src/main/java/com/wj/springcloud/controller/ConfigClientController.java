package com.wj.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wen.jie
 * @Classname ConfigClientController
 * @Description TODO
 * @Date 2020/9/6
 */
@RefreshScope
@RestController
public class ConfigClientController {
    @Value("${config.info}")
    private String info;
    @GetMapping("/config/client/info")
    public String getInfo(){
        return info;
    }
}
