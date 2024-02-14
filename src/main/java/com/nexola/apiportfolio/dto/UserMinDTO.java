package com.nexola.apiportfolio.dto;

import com.nexola.apiportfolio.entities.Role;
import com.nexola.apiportfolio.entities.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.HashSet;
import java.util.Set;

public class UserMinDTO {
    private Long id;
    @NotBlank(message = "Campo obrigatório")
    private String name;
    @Email(message = "Favor entrar com email válido")
    private String email;
    private Set<RoleDTO> roles = new HashSet<>();

    public UserMinDTO(){}

    public UserMinDTO(User entity) {
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        for (Role role : entity.getRoles()) {
            roles.add(new RoleDTO(role));
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }
}
