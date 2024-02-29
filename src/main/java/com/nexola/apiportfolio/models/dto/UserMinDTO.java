package com.nexola.apiportfolio.models.dto;

import com.nexola.apiportfolio.models.entities.User;
import org.springframework.hateoas.RepresentationModel;

public class UserMinDTO extends RepresentationModel<UserMinDTO> {
    private String name;
    private String email;

    public UserMinDTO(){}

    public UserMinDTO(User entity) {
        name = entity.getName();
        email = entity.getEmail();
    }

    public UserMinDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
