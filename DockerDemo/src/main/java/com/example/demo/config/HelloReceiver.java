package com.example.demo.config;

import com.example.demo.Exception.MyException;
import com.example.demo.entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloReceiver {

    @RabbitHandler
    @RabbitListener(queues = "hello")
    public void process(String user) throws MyException {
        System.out.println("Receiver user : " + user);
//        throw new MyException("报错了");
    }
}
