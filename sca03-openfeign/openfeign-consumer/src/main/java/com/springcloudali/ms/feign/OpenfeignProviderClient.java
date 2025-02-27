package com.springcloudali.ms.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("openfeign-provider")
public interface OpenfeignProviderClient {

    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    public String echo(@PathVariable String id);

}
