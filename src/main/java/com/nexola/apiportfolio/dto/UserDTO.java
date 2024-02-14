package com.nexola.apiportfolio.dto;

import com.nexola.apiportfolio.entities.Role;
import com.nexola.apiportfolio.entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {
    private Long id;
    private String name;
    private String username;
    private List<String> roles = new ArrayList<>();

    private HeaderDTO header;

    private FooterDTO footer;

    private ExperienceDTO experience;

    private EducationDTO education;

    public UserDTO(){}

    public UserDTO(User entity) {
        id = entity.getId();
        name = entity.getName();
        username = entity.getEmail();
        for (Role role : entity.getRoles()) {
            roles.add(role.getAuthority());
        }
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

    public List<String> getRoles() {
        return roles;
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
}
