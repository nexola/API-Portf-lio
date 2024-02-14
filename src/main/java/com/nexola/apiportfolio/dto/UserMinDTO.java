package com.nexola.apiportfolio.dto;

import com.nexola.apiportfolio.entities.Role;
import com.nexola.apiportfolio.entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserMinDTO {
    private Long id;
    private String name;
    private String username;
    private List<String> roles = new ArrayList<>();

    public UserMinDTO(){}

    public UserMinDTO(User entity) {
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
}
