package com.study.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class Bootstrapper implements ApplicationListener {
    @Value("${server.port}")
    private String port;

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

    }
}
