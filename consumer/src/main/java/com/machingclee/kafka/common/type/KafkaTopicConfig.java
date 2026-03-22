package com.machingclee.kafka.common.type;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
class KafkaTopicConfig {
    @Bean
    public NewTopic topic1() {
        return  TopicBuilder.name("my-topic")
                .partitions(3)
                .replicas(3)
                .build();
    }

    @Bean
    public NewTopic topic2() {
        return  TopicBuilder.name("topic-created-by-spring")
                .partitions(3)
                .replicas(3)
                .build();
    }
}

