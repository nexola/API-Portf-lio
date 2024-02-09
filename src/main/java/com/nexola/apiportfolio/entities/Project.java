package com.nexola.apiportfolio.entities;

import jakarta.persistence.*;

import java.time.Year;
import java.util.Objects;

@Entity
@Table(name = "tb_project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Year conclusionYear;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String course;

    public Project() {
    }

    public Project(Long id, String title, Year year, String description, String course) {
        this.id = id;
        this.title = title;
        this.conclusionYear = year;
        this.description = description;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Year getYear() {
        return conclusionYear;
    }

    public void setYear(Year year) {
        this.conclusionYear = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        return Objects.equals(id, project.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}