package com.springcloud;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: SFX
 * @Date: 2021/2/25 15:51
 * @description:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain8001 {


    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}
