package com.nexola.apiportfolio.models.embedded;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Education {
    private String description;

    private List<Diploma> degrees = new ArrayList<>();
    private Set<Language> languages = new HashSet<>();
    private List<Complementary> courses = new ArrayList<>();
    private List<Certificate> certificates = new ArrayList<>();

    public Education(){}

    public Education(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Diploma> getDegrees() {
        return degrees;
    }

    public Set<Language> getLanguages() {
        return languages;
    }

    public List<Complementary> getCourses() {
        return courses;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }
}
