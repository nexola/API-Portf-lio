package com.nexola.apiportfolio.models.embedded;

public class Complementary {
    private String course;
    private boolean isFinished;
    private Integer hours;

    public Complementary(){}

    public Complementary(String course, boolean isFinished, Integer hours) {
        this.course = course;
        this.isFinished = isFinished;
        this.hours = hours;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
