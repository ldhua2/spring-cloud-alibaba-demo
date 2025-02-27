package com.springcloudali.ms.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class NacosRegistryProviderController {

    // http://localhost:9030/hello/andy
    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    public String echo (@PathVariable String id) {
        return "NacosProvider recv args: id=" + id +", date=" +new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }



}
