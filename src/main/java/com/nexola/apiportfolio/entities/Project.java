package com.nexola.apiportfolio.entities;

import jakarta.persistence.*;

import java.time.Year;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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

    @OneToMany(mappedBy = "project")
    private Set<Technology> technologies = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "experience_id")
    private Experience experience;

    public Project() {
    }

    public Project(Long id, String title, Year year, String description, String course, Experience experience) {
        this.id = id;
        this.title = title;
        this.conclusionYear = year;
        this.description = description;
        this.course = course;
        this.experience = experience;
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

    public Year getConclusionYear() {
        return conclusionYear;
    }

    public void setConclusionYear(Year year) {
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

    public Set<Technology> getTechnologies() {
        return technologies;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
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