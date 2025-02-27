package com.springcloudali.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OpenFeignProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignProviderApplication.class);
        System.out.println("OpenFeignProviderApplication启动成功！");
    }
}
