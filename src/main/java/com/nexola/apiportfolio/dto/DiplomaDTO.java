package com.nexola.apiportfolio.dto;

import com.nexola.apiportfolio.entities.Diploma;

import java.time.Year;

public class DiplomaDTO {
    private Long id;
    private String course;
    private Year starYear;
    private Year conclusionYear;
    private String institution;

    public DiplomaDTO() {
    }

    public DiplomaDTO(Long id, String course, Year starYear, Year conclusionYear, String institution) {
        this.id = id;
        this.course = course;
        this.starYear = starYear;
        this.conclusionYear = conclusionYear;
        this.institution = institution;
    }

    public DiplomaDTO(Diploma entity) {
        id = entity.getId();
        course = entity.getCourse();
        starYear = entity.getStartYear();
        conclusionYear = entity.getConclusionYear();
        institution = entity.getInstitution();
    }

    public Long getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public Year getStarYear() {
        return starYear;
    }

    public Year getConclusionYear() {
        return conclusionYear;
    }

    public String getInstitution() {
        return institution;
    }
}
