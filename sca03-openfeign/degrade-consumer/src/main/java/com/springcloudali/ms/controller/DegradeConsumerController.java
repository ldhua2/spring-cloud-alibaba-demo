package com.springcloudali.ms.controller;

import com.springcloudali.ms.feign.DegradeFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DegradeConsumerController {

    @Autowired
    private DegradeFeignClient degradeFeignClient;

    @RequestMapping(value = "/helloword/{id}", method = RequestMethod.GET)
    public String echo(@PathVariable String id) {
        return degradeFeignClient.echo(id);
    }

}
