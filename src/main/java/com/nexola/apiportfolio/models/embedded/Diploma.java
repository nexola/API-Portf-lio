package com.nexola.apiportfolio.models.embedded;

public class Diploma {
    private String degree;
    private String course;
    private Integer startYear;
    private Integer conclusionYear;
    private String institution;

    public Diploma(){}

    public Diploma(String degree, String course, Integer startYear, Integer conclusionYear, String institution) {
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

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getConclusionYear() {
        return conclusionYear;
    }

    public void setConclusionYear(Integer conclusionYear) {
        this.conclusionYear = conclusionYear;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
}
