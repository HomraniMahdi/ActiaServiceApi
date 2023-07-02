package com.monitoring.Application.Service.User;


import com.monitoring.Application.Model.User.User;
import com.monitoring.Application.Service.Kafka.KafkaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService, KafkaService {
    private final UserService userService;

    @Autowired
    public UserServiceImpl(UserService userService) {
        this.userService = userService;
    }
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    public static final String TOPIC_NAME = "monitoring-topics";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Override
    public List<User> getUsers() {
        return userService.getUsers();
    }
    @Override
    public void producer(User user) {
        logger.info("Sending message to kafka: {}", user);
        try {
            kafkaTemplate.send(TOPIC_NAME, new ObjectMapper().writeValueAsString(user));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
    @Override
    @KafkaListener(id = "json-group", topics = TOPIC_NAME)
    public void consumer(String userstr) {
        try {
            logger.info("Received message from kafka: {}", new ObjectMapper().readValue(userstr, User.class));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Scheduled(fixedRate = 2000)
    public void published(){
        logger.info("publishing ...");
        User user = new User();
        user.setName(UUID.randomUUID().toString());
        user.setEmail("mahdi.hormani@esprit.tn");
        user.setBody("OK");
        producer(user);
    }
}