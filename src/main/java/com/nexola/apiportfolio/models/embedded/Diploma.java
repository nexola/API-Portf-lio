package com.nexola.apiportfolio.models.embedded;

import java.time.Year;

public class Diploma {
    private String degree;
    private String course;
    private Year startYear;
    private Year conclusionYear;
    private String institution;

    public Diploma(){}

    public Diploma(String degree, String course, Year startYear, Year conclusionYear, String institution) {
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

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
}
