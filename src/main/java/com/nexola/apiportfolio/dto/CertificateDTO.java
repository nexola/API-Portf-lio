package com.nexola.apiportfolio.dto;

import com.nexola.apiportfolio.entities.Certificate;

public class CertificateDTO {
    private Long id;
    private String course;
    private String link;
    private String institution;

    public CertificateDTO(){}

    public CertificateDTO(Long id, String course, String link, String institution) {
        this.id = id;
        this.course = course;
        this.link = link;
        this.institution = institution;
    }

    public CertificateDTO(Certificate entity) {
        id = entity.getId();
        course = entity.getCourse();
        link = entity.getLink();
        institution = entity.getInstitution();
    }

    public Long getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public String getLink() {
        return link;
    }

    public String getInstitution() {
        return institution;
    }
}
