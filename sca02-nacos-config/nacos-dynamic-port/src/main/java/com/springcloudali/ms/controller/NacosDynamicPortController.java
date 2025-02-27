package com.springcloudali.ms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping("/config")
@RefreshScope
public class NacosDynamicPortController {

    @Value("${server.port}")
    private int port;

    @RequestMapping("/info")
    public String get() {
        return "NacosDynamicPortController output, port: " + port;
    }

}