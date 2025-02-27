package com.springcloudali.ms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping("/config")
@RefreshScope
public class NacosDynamicEnvController {

    @Value("${server.port}")
    private int port;
    @Value("${user.name}")
    private String userName;
    @Value("${user.pwd}")
    private String pwd;



    @RequestMapping("/info")
    public String get() {
        return "NacosDynamicEnvController output, " +
                "port: " + port +", userName: " + userName + ", pwd: " + pwd;
    }

}