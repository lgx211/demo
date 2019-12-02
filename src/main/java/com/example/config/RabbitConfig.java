package com.example.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConfig {

    //==============发布/订阅模式==============

    //队列A
    @Bean()
    public Queue queueA() {
        return new Queue("fanoutQueueA");
    }

    //队列B
    @Bean()
    public Queue queueB() {
        return new Queue("fanoutQueueB");
    }

    //发布订阅模式下的 fanout 交换机
    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }

    // 把 队列A 和 fanout交换机 绑定在一起
    @Bean
    public Binding bindingWithQueueA() {
        return BindingBuilder.bind(queueA()).to(fanoutExchange());
    }

    // 把 队列B 和 fanout交换机 绑定在一起
    @Bean
    public Binding bindingWithQueueB() {
        return BindingBuilder.bind(queueB()).to(fanoutExchange());
    }


    //==============路由模式==============
    //队列C
    @Bean()
    public Queue queueC() {
        return new Queue("directQueueC");
    }

    //队列D
    @Bean()
    public Queue queueD() {
        return new Queue("directQueueD");
    }

    //发布订阅模式下的 direct 交换机
    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange("directExchange");
    }

    // 把 队列C 和 direct交换机 绑定在一起
    @Bean
    public Binding bindingWithQueueC() {
        return BindingBuilder.bind(queueC()).to(directExchange()).with("directRoutingkey");
    }

    // 把 队列B 和 direct交换机 绑定在一起
    @Bean
    public Binding bindingWithQueueD() {
        return BindingBuilder.bind(queueD()).to(directExchange()).with("directRoutingkey");
    }

}
