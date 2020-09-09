package com.wj.springcloud.service;

import com.wj.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author wen.jie
 * @Classname AccountService
 * @Description TODO
 * @Date 2020/9/9
 */
@Component
@FeignClient(value="seata-account-service")
public interface AccountService {

    @PostMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("count") BigDecimal count);

}
