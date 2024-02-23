package com.nexola.apiportfolio.models.dto;

import com.nexola.apiportfolio.models.entities.Role;

public class RoleDTO {
    private String id;
    private String authority;

    public RoleDTO(){}

    public RoleDTO(Role entity) {
        id = entity.getId();
        authority = entity.getAuthority();
    }

    public RoleDTO(String id, String authority) {
        this.id = id;
        this.authority = authority;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
