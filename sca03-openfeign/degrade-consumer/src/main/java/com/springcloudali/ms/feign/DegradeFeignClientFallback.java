package com.springcloudali.ms.feign;

import org.springframework.stereotype.Component;

@Component
public class DegradeFeignClientFallback implements DegradeFeignClient {


    @Override
    public String echo(String id) {
        return "DegradeFallback recv args: id=" + id;
    }
}
