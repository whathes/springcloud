package com.study.feignservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client-02")
public interface FeignConfig {
    @GetMapping("/hello")
    public String hello();
}
