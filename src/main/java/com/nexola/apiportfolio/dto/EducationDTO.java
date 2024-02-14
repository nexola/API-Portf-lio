package com.nexola.apiportfolio.dto;

import com.nexola.apiportfolio.entities.*;

import java.util.ArrayList;
import java.util.List;

public class EducationDTO {
    private String description;
    private List<DiplomaDTO> degrees = new ArrayList<>();

    private List<ComplementaryDTO> courses = new ArrayList<>();

    private List<CertificateDTO> certificates = new ArrayList<>();

    private List<LanguageDTO> languages = new ArrayList<>();

    public EducationDTO(){}

    public EducationDTO(String description) {
        this.description = description;
    }

    public EducationDTO(Education entity) {
        description = entity.getDescription();
        for (Diploma diploma : entity.getDiplomas()) {
            degrees.add(new DiplomaDTO(diploma));
        }
        for (Complementary complementary : entity.getCourses()) {
            courses.add(new ComplementaryDTO(complementary));
        }
        for (Certificate certificate : entity.getCertificates()) {
            certificates.add(new CertificateDTO(certificate));
        }
        for (Language language : entity.getLanguages()) {
            languages.add(new LanguageDTO(language));
        }
    }

    public String getDescription() {
        return description;
    }

    public List<DiplomaDTO> getDegrees() {
        return degrees;
    }

    public List<ComplementaryDTO> getCourses() {
        return courses;
    }

    public List<CertificateDTO> getCertificates() {
        return certificates;
    }

    public List<LanguageDTO> getLanguages() {
        return languages;
    }
}
