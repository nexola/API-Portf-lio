package com.nexola.apiportfolio.models.embedded;

public class Complementary {
    private String course;
    private String platform;
    private boolean isFinished;
    private Integer hours;

    public Complementary(){}

    public Complementary(String course, String platform, boolean isFinished, Integer hours) {
        this.course = course;
        this.platform = platform;
        this.isFinished = isFinished;
        this.hours = hours;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
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
