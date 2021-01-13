package com.study.controller;

import com.study.service.Webservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class WebController {
    @Autowired
    Webservice webservice;

    @GetMapping("/time")
    @LoadBalanced
    public String time(HttpServletRequest request){
        Long t = System.currentTimeMillis();
        webservice.run();
        return "success";
    }
}
