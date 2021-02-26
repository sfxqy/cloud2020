package com.springcloud.dao;

import com.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: SFX
 * @Date: 2021/2/25 16:07
 * @description:
 */

@Mapper
public interface PaymentDao {

    int create(Payment payment); //写

    Payment getPaymentById(@Param("id") Long id);  //读取
}
