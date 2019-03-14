package com.example.demo.config;

import com.example.demo.Exception.MyException;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class FanoutA {

    @RabbitHandler
    @RabbitListener(queues = "fanout.A")
    public void process(String user) throws MyException {
        System.out.println("fanout.a : " + user);
    }
}
