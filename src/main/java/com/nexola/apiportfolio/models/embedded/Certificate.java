package com.nexola.apiportfolio.models.embedded;

public class Certificate {
    private String course;
    private String link;
    private String institution;

    public Certificate(){}

    public Certificate(String course, String link, String institution) {
        this.course = course;
        this.link = link;
        this.institution = institution;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
}
