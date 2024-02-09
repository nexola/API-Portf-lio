package com.nexola.apiportfolio.entities;

import com.nexola.apiportfolio.Education;
import jakarta.persistence.*;

import java.time.Year;
import java.util.Objects;

@Entity
@Table(name = "tb_diploma")
public class Diploma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String degree;
    private String course;
    private Year startYear;
    private Year conclusionYear;

    @ManyToOne
    @JoinColumn(name = "education_id")
    private Education education;

    public Diploma() {}

    public Diploma(Long id, String degree, String course, Year startYear, Year conclusionYear, Education education) {
        this.id = id;
        this.degree = degree;
        this.course = course;
        this.startYear = startYear;
        this.conclusionYear = conclusionYear;
        this.education = education;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Year getStartYear() {
        return startYear;
    }

    public void setStartYear(Year startYear) {
        this.startYear = startYear;
    }

    public Year getConclusionYear() {
        return conclusionYear;
    }

    public void setConclusionYear(Year conclusionYear) {
        this.conclusionYear = conclusionYear;
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

        Diploma diploma = (Diploma) o;

        return Objects.equals(id, diploma.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
