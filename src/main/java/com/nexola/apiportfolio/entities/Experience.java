package com.nexola.apiportfolio.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_experience")
public class Experience {
    @Id
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String summary;

    @OneToMany(mappedBy = "experience")
    private List<Project> projects = new ArrayList<>();

    @OneToOne
    @MapsId
    private User user;

    public Experience(){}

    public Experience(Long id, String summary, User user) {
        this.id = id;
        this.summary = summary;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Project> getProjects() {
        return projects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Experience that = (Experience) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
