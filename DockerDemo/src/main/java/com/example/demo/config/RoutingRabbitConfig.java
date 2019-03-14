package com.example.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutingRabbitConfig {

    private String u;

    @Bean
    public Queue routQueue() {
        return new Queue("rout");
    }

    @Bean
    public Queue routQueue1() {
        return new Queue("root1");
    }

    @Bean
    DirectExchange directExchange() {
        return new DirectExchange("directExchange");
    }

    @Bean
    Binding bindingRoutQueue(DirectExchange directExchange, Queue routQueue) {
        return BindingBuilder.bind(routQueue).to(directExchange).with("black");
    }

    @Bean
    Binding bindingRoutQueue1(DirectExchange directExchange, Queue routQueue1) {
        return BindingBuilder.bind(routQueue1).to(directExchange).with("white");
    }
}
