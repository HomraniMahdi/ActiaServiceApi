package com.example.api.kafka;


import com.example.api.Persistence.Entity.User;
import org.apache.kafka.clients.producer.Producer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@Service
public class KafkaConsumer {

    @KafkaListener(topics="my_topic", groupId="my_group_id")
    public void getMessage(String message){

        System.out.println(message);

    }
}