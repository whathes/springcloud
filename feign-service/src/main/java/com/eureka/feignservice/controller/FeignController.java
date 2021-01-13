package com.eureka.feignservice.controller;

import com.eureka.feignservice.feign.FeignConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignConfig feignConfig;
    @GetMapping("/hello")
    public String hello(){
        return feignConfig.hello();
    }

}
