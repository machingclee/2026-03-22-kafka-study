package com.machingclee.kafka.controller;


import com.machingclee.kafka.service.KafkaConsumerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    private final KafkaConsumerService kafkaService;

    public KafkaController(KafkaConsumerService kafkaService) {
        this.kafkaService = kafkaService;
    }
}
