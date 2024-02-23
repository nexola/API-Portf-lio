package com.nexola.apiportfolio.models.projections;

public interface UserDetailsProjection {

    String getUsername();
    String getPassword();
    String getRoleId();
    String getAuthority();
}
