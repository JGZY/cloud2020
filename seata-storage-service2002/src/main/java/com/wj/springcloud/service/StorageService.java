package com.wj.springcloud.service;

import com.wj.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wen.jie
 * @Classname StorageService
 * @Description TODO
 * @Date 2020/9/9
 */
@Component
public interface StorageService {

    public void decrease(Long productId, Integer count);
}
