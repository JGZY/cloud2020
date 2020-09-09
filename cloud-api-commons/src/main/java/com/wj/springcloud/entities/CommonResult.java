package com.wj.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wen.jie
 * @Classname CommonResult
 * @Description TODO
 * @Date 2020/9/3
 */
@Data@AllArgsConstructor@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
