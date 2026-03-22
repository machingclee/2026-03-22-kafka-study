package com.machingclee.kafka.controller;


import com.machingclee.kafka.common.type.Course;
import com.machingclee.kafka.service.KafkaProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    private final KafkaProducerService kafkaProducerService;

    public KafkaController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping("/add-course")
    public ResponseEntity<String> addCourse (@RequestBody Course course) {
        // send course to kafka service

        String response = kafkaProducerService.sendMessage(course);
        return ResponseEntity.ok(response);
    }
}
