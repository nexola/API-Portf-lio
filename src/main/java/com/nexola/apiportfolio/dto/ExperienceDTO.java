package com.nexola.apiportfolio.dto;

import com.nexola.apiportfolio.entities.Experience;
import com.nexola.apiportfolio.entities.Project;

import java.util.ArrayList;
import java.util.List;

public class ExperienceDTO {
    private String summary;

    private List<ProjectDTO> projects = new ArrayList<>();

    public ExperienceDTO(){}

    public ExperienceDTO(String summary) {
        this.summary = summary;
    }

    public ExperienceDTO(Experience entity) {
        summary = entity.getSummary();
        for (Project proj : entity.getProjects()) {
            projects.add(new ProjectDTO(proj));
        }
    }
}
