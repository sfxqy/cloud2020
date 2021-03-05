package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: SFX
 * @Date: 2021/2/27 14:03
 * @description:
 */


@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain8006 {


    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8006.class);
    }
}
