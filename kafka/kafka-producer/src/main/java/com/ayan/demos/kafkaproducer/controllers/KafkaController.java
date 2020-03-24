package com.ayan.demos.kafkaproducer.controllers;

import com.ayan.demos.kafkaproducer.models.LoggerJava;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka")
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, LoggerJava> kafkaTemplate;

    @Value("${spring.kafka.topic.logger-java}")
    private String topic;

    @PostMapping(path = "send")
    public void send(@RequestBody LoggerJava loggerJava) {
        kafkaTemplate.send(topic, loggerJava);
    }

}
