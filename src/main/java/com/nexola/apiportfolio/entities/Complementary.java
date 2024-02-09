package com.nexola.apiportfolio.entities;

import com.nexola.apiportfolio.Education;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_complementary")
public class Complementary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String course;
    private boolean isFinished;
    private Integer hours;

    @ManyToOne
    @JoinColumn(name = "education_id")
    private Education education;

    public Complementary(){}

    public Complementary(Long id, String course, boolean isFinished, Integer hours, Education education) {
        this.id = id;
        this.course = course;
        this.isFinished = isFinished;
        this.hours = hours;
        this.education = education;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Complementary that = (Complementary) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
