package com.nexola.apiportfolio.dto;

import com.nexola.apiportfolio.entities.Complementary;

public class ComplementaryDTO {
    private Long id;
    private String course;
    private boolean isFinished;
    private Integer hours;

    public ComplementaryDTO(){}

    public ComplementaryDTO(Long id, String course, boolean isFinished, Integer hours) {
        this.id = id;
        this.course = course;
        this.isFinished = isFinished;
        this.hours = hours;
    }

    public ComplementaryDTO(Complementary entity){
        id = entity.getId();
        course = entity.getCourse();
        isFinished = entity.isFinished();
        hours = entity.getHours();
    }

    public Long getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public Integer getHours() {
        return hours;
    }
}
