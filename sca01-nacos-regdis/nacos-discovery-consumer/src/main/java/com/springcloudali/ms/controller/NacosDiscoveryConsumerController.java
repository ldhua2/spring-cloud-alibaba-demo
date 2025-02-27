package com.springcloudali.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class NacosDiscoveryConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    // http://localhost:9031/helloworld/geek
    @RequestMapping(value = "/helloworld/{id}", method = RequestMethod.GET)
    public String echo(@PathVariable String id) {
        return restTemplate.getForObject("http://nacos-registry-provider/hello/"+id, String.class);
    }

}
