package com.nexola.apiportfolio.models.embedded;

import java.util.ArrayList;
import java.util.List;

public class Experience {
    private String summary;

    private List<Project> projects = new ArrayList<>();

    public Experience(){}

    public Experience(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<Project> getProjects() {
        return projects;
    }
}
