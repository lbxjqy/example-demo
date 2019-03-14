package com.example.demo.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class FanoutB {

    @RabbitHandler
    @RabbitListener(queues = "fanout.B")
    public void process(String user) {
        System.out.println("FanoutB" + user);
    }
}
