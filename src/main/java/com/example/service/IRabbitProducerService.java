package com.example.service;

public interface IRabbitProducerService {

    void producerFanout(String message);

    void producerDirect(String message);

}
