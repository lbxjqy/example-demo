package com.example.demo.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "rout")
public class RoutReceiver {

    @RabbitHandler
    public void process(String u) {
        System.out.println("RoutReceiver : " + u);
    }
}
