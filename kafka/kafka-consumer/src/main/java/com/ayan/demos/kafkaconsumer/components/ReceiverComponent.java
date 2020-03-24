package com.ayan.demos.kafkaconsumer.components;

import com.ayan.demos.kafkaconsumer.models.LoggerJava;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.stereotype.Component;

@Component
public class ReceiverComponent {

    @KafkaListener(id = "logger-java", topics = "logger-java", concurrency = "1")
    public void receive(LoggerJava loggerJava) {
        System.out.println(loggerJava);
    }

}