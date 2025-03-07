package com.springcloudali.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NacosDynamicPortApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDynamicPortApplication.class);
        System.out.println("NacosDynamicPortApplication启动成功！");
    }
}
