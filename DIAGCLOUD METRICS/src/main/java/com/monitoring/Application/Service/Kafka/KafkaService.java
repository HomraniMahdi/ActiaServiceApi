package com.monitoring.Application.Service.Kafka;

import com.monitoring.Application.Model.User.User;

public interface KafkaService {
    void producer(User user);
    void consumer(String userstr);
}
