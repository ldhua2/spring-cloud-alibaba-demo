package com.springcloudali.ms.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class OpenFeignProviderController {
    @Value("${server.port}")
    private String port;

    // http://localhost:9040/hello/andy
    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    public String echo (@PathVariable String id) {
        return "OpenFeignProvider recv args: id=" + id
                +", port=" + port
                +", date=" +new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

}
