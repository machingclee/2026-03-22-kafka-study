package com.machingclee.kafka.service;

import com.machingclee.kafka.common.type.Course;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    private final KafkaTemplate<String, Course> kafkaTemplate;
    private String message;
    public KafkaConsumerService(KafkaTemplate<String, Course> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public String getMessage (Course course) {
        System.out.println("Received course: " + course);
        return "Course message received from Kafka service";
    }
}
