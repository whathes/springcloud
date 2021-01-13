package com.eureka.cfg;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateCfg {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplateConfig(){
        return new RestTemplate();
    }
}
