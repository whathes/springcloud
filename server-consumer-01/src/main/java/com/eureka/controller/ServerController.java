package com.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServerController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String serverConsumer(){
        String s = restTemplate.getForObject("http://eureka-client-02/hello",String.class);
        return s;
    }
}
