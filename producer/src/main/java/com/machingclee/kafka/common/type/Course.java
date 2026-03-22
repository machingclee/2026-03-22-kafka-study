package com.machingclee.kafka.common.type;

public class Course {
    private String courseId;
    private String title;
    private String trainer;
    private double price;

    public Course(String courseId, String title, String trainer, double price) {
        this.courseId = courseId;
        this.title = title;
        this.trainer = trainer;
        this.price = price;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }
}

