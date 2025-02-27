package com.springcloudali.ms.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class DegradeFeignClientFallbackFactory implements FallbackFactory<DegradeFeignClientFallbackFactory.DegradeFeignClientFallbackFactoryInner> {

    @Override
    public DegradeFeignClientFallbackFactoryInner create(Throwable cause) {
        System.out.println("DegradeFeignClientFallbackFactory错误原因："+cause.getMessage());
        return new DegradeFeignClientFallbackFactoryInner();
    }

    static class DegradeFeignClientFallbackFactoryInner implements DegradeFeignClient{

        @Override
        public String echo(String id) {
            return "DegradeFeignClientFallbackFactory recv id=" +id;
        }
    }

}
