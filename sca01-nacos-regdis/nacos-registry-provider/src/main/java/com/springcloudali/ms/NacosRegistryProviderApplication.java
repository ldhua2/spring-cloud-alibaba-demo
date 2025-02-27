package com.springcloudali.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosRegistryProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosRegistryProviderApplication.class);
        System.out.println("NacosRegistryProviderApplication启动成功！");
    }
}
