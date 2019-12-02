package com.example.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitConsumerServiceIml implements IRabbitConsumerService {

    @RabbitListener(queues = "fanoutQueueA")
    public void consumerFanoutA(String message) {
        System.out.println("消费者收到队列A中的消息:" + message);
    }

    @RabbitListener(queues = "fanoutQueueB")
    public void consumerFanoutB(String message) {
        System.out.println("消费者收到队列B中的消息:" + message);
    }

    @RabbitListener(queues = "routingQueueC")
    public void consumerDirectC(String message) {
        System.out.println("消费者收到队列C中的消息:" + message);
    }

    @RabbitListener(queues = "routingQueueD")
    public void consumerDirectD(String message) {
        System.out.println("消费者收到队列D中的消息:" + message);
    }

}
