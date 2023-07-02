package com.monitoring.Application.Service.Kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics="message", groupId="Monitoring-Message")
    public void getMessage(String message){

        System.out.println(message);

    }
}