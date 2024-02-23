package com.nexola.apiportfolio.models.projections;

import com.nexola.apiportfolio.models.entities.Role;

import java.util.Set;

public interface UserDetailsProjection {

    String getUsername();
    String getPassword();
    Set<Role> getRoles();
}
