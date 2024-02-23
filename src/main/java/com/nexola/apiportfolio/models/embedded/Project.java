package com.nexola.apiportfolio.models.embedded;

import java.util.HashSet;
import java.util.Set;

public class Project {
    private String title;
    private Integer conclusionYear;
    private String description;
    private String course;

    private Set<Technology> technologies = new HashSet<>();

    public Project(){}

    public Project(String title, Integer conclusionYear, String description, String course) {
        this.title = title;
        this.conclusionYear = conclusionYear;
        this.description = description;
        this.course = course;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getConclusionYear() {
        return conclusionYear;
    }

    public void setConclusionYear(Integer conclusionYear) {
        this.conclusionYear = conclusionYear;
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
}
