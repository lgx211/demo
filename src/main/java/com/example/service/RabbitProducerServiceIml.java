package com.example.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("rabbitProducerService")
public class RabbitProducerServiceIml implements IRabbitProducerService {


    @Autowired
    RabbitTemplate rabbitTemplate;

    public void producerFanout(String message) {
        rabbitTemplate.convertAndSend("fanoutExchange", null, message);
    }

    public void producerDirect(String message) {
        rabbitTemplate.convertAndSend("directExchange", "directRoutingkey", message);
    }


}
