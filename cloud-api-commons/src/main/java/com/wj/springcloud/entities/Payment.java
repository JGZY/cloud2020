package com.wj.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wen.jie
 * @Classname Payment
 * @Description TODO
 * @Date 2020/9/3
 */
@Data@AllArgsConstructor@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
