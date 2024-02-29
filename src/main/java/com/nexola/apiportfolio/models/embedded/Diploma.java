package com.nexola.apiportfolio.models.embedded;

import java.time.LocalDate;

public class Diploma {
    private String degree;
    private String course;
    private LocalDate startYear;
    private LocalDate conclusionYear;
    private String institution;

    public Diploma(){}

    public Diploma(String degree, String course, LocalDate startYear, LocalDate conclusionYear, String institution) {
        this.degree = degree;
        this.course = course;
        this.startYear = startYear;
        this.conclusionYear = conclusionYear;
        this.institution = institution;
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

    public LocalDate getStartYear() {
        return startYear;
    }

    public void setStartYear(LocalDate startYear) {
        this.startYear = startYear;
    }

    public LocalDate getConclusionYear() {
        return conclusionYear;
    }

    public void setConclusionYear(LocalDate conclusionYear) {
        this.conclusionYear = conclusionYear;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
}
