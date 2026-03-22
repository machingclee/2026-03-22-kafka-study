package com.machingclee.kafka.common.type;

public record Course(
        String courseId,
        String title,
        String trainer,
        double price
) {
}

