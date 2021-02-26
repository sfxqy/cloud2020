package com.springcloud.service;


import com.springcloud.entities.Payment;

/**
 * @Author: SFX
 * @Date: 2021/2/25 16:13
 * @description:
 */
public interface PaymentService {

    int create(Payment payment); //写

    Payment getPaymentById(Long id);  //读取
}
