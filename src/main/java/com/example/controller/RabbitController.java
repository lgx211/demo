package com.example.controller;

import com.example.service.IRabbitProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("rabbit")
public class RabbitController {

    @Autowired
    private IRabbitProducerService rabbitProducerService;

    @RequestMapping("/fanout")
    public void fanout() {
        for (int i = 0; i < 5; i++) {
            this.rabbitProducerService.producerFanout("发布订阅模式下的第" + i + "条信息");
        }
    }

    @RequestMapping("/direct")
    public void direct() {
        for (int i = 0; i < 5; i++) {
            this.rabbitProducerService.producerDirect("路由模式下的第" + i + "条信息");
        }
    }

}
