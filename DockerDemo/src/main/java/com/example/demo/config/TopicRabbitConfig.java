package com.example.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicRabbitConfig {
    final static String message = "topic.message";
    final static String messages = "topic.messages";

    @Bean
    public Queue queuemessage() {
        return new Queue(TopicRabbitConfig.message);
    }

    @Bean
    public Queue queuemessages() {
        return new Queue(TopicRabbitConfig.messages);
    }

    @Bean
    public Queue queuemessagess() {
        return new Queue("topic.m");
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange("exchange");
    }

//    @Bean
//    Binding bindingExchangeMessage(Queue queuemessage, TopicExchange topicExchange){
//        return BindingBuilder.bind(queuemessage).to(topicExchange).with(TopicRabbitConfig.message);
//    }

    @Bean
    Binding bindingExchangeMessages(Queue queuemessages, TopicExchange topicExchange) {
        return BindingBuilder.bind(queuemessages).to(topicExchange).with("topic.messages");
    }

    @Bean
    Binding bindingExchangeMessagess(Queue queuemessages, TopicExchange topicExchange) {
        return BindingBuilder.bind(queuemessages).to(topicExchange).with("topic.messagess");
    }
}
