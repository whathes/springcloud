package com.study.config;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class HelloListener {
    @KafkaListener(topics = "hello")
    public void helloWorld(ConsumerRecord<?,?> record){
        System.out.println("------------------------"+record.topic()+"------------------------------------");
    }
}
