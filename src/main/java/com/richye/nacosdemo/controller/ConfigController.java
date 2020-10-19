package com.richye.nacosdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Shuye
 * Date: 2020/10/19 11:32
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${demo.hello}")
    private String hello;

    @GetMapping("/hello")
    public String sayHello() {
        return hello;
    }
}
