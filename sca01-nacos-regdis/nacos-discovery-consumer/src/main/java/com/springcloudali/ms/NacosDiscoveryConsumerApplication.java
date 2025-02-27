package com.springcloudali.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscoveryConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryConsumerApplication.class);
        System.out.println("NacosDiscoveryConsumerApplication启动成功！");
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
