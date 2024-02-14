package com.nexola.apiportfolio.dto;

import com.nexola.apiportfolio.entities.User;

import java.util.HashSet;
import java.util.Set;

public class UserDTO {
    private Long id;
    private String name;
    private String username;
    private Set<RoleDTO> roles = new HashSet<>();

    private HeaderDTO header;

    private FooterDTO footer;

    private ExperienceDTO experience;

    private EducationDTO education;

    public UserDTO(){}

    public UserDTO(User entity) {
        id = entity.getId();
        name = entity.getName();
        username = entity.getEmail();
        entity.getRoles().forEach(role -> roles.add(new RoleDTO(role)));
        header = new HeaderDTO(entity.getHeader());
        footer = new FooterDTO(entity.getFooter());
        experience = new ExperienceDTO(entity.getExperience());
        education = new EducationDTO(entity.getEducation());

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public HeaderDTO getHeader() {
        return header;
    }

    public FooterDTO getFooter() {
        return footer;
    }

    public ExperienceDTO getExperience() {
        return experience;
    }

    public EducationDTO getEducation() {
        return education;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }
}
