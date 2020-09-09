package com.wj.springcloud.dao;

import com.wj.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wen.jie
 * @Classname PaymentDao
 * @Description TODO
 * @Date 2020/9/3
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
