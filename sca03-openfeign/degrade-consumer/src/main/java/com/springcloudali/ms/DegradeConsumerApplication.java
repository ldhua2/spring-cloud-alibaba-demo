package com.springcloudali.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
// @ComponentScan(basePackages = "com.springcloudali.*.*")
public class DegradeConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DegradeConsumerApplication.class, args);
    }
}
