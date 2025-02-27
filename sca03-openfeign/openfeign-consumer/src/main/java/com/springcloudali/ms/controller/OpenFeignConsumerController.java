package com.springcloudali.ms.controller;

import com.springcloudali.ms.feign.OpenfeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenFeignConsumerController {

    @Autowired
    private OpenfeignProviderClient providerClient;

    @RequestMapping(value = "/helloword/{id}", method = RequestMethod.GET)
    public String echo(@PathVariable String id) {
        return providerClient.echo(id);
    }

}
