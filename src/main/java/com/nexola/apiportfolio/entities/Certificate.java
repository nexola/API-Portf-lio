package com.nexola.apiportfolio.entities;

import com.nexola.apiportfolio.Education;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_certificate")
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String course;
    private String link;
    private String institution;

    @ManyToOne
    @JoinColumn(name = "education_id")
    private Education education;

    public Certificate(){}

    public Certificate(Long id, String course, String link, String institution, Education education) {
        this.id = id;
        this.course = course;
        this.link = link;
        this.institution = institution;
        this.education = education;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Certificate that = (Certificate) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
