package com.springcloud;

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
public class PaymentMain8002 {


    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
