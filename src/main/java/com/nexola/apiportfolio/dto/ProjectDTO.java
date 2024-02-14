package com.nexola.apiportfolio.dto;

import com.nexola.apiportfolio.entities.Project;
import com.nexola.apiportfolio.entities.Technology;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class ProjectDTO {
    private Long id;
    private String title;
    private Year conclusionYear;
    private String description;
    private String course;
    private List<String> technologies = new ArrayList<>();

    public ProjectDTO(){}

    public ProjectDTO(Long id, String title, Year conclusionYear, String description, String course) {
        this.id = id;
        this.title = title;
        this.conclusionYear = conclusionYear;
        this.description = description;
        this.course = course;
    }

    public ProjectDTO(Project entity) {
        id = entity.getId();
        title = entity.getTitle();
        conclusionYear = entity.getConclusionYear();
        description = entity.getDescription();
        course = entity.getCourse();

        for (Technology technology : entity.getTechnologies()) {
            technologies.add(technology.getName());
        }
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Year getConclusionYear() {
        return conclusionYear;
    }

    public String getDescription() {
        return description;
    }

    public String getCourse() {
        return course;
    }

    public List<String> getTechnologies() {
        return technologies;
    }
}
