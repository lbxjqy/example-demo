package com.example.demo.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.messages")
public class TopicReceiver1 {

    @RabbitHandler
    public void process(String message) {
        System.out.println("TopicReceiver1 : " + message);
    }
}