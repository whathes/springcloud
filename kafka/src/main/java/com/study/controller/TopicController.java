package com.study.controller;

import org.apache.kafka.clients.KafkaClient;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.KafkaAdminClient;
import org.apache.kafka.clients.admin.ListTopicsResult;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Set;

@RestController
public class TopicController {
    @Autowired
    private KafkaAdmin kafkaAdmin;
    @Autowired
    private AdminClient adminClient;

    @RequestMapping(value = "/create/{name}/topic",method = RequestMethod.GET)
    public String createTopic(@PathVariable("name") String name){
        NewTopic newTopic = new NewTopic(name, 3, (short) 1);
        adminClient.createTopics(Arrays.asList(newTopic));
        return "new topic created!";
    }


    @RequestMapping("/topic/list")
    public void getAllTopic() throws Exception {
        ListTopicsResult listTopics = adminClient.listTopics();
        Set<String> topics = listTopics.names().get();

        for (String topic : topics) {
            System.err.println(topic);
        }
    }
}
