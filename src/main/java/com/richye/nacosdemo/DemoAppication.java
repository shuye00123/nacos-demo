package com.richye.nacosdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

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
