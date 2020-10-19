package com.richye.nacosdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author: Shuye
 * Date: 2020/10/16 15:31
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DemoAppication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAppication.class, args);
    }

}
