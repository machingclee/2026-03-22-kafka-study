package com.machingclee.kafka.service;

import com.machingclee.kafka.common.type.Course;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    private final KafkaTemplate<String, Course> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, Course> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public String sendMessage (Course course) {
        this.kafkaTemplate.send("my-topic", "course", course);
        return "Course message sent to Kafka service";
    }
}
