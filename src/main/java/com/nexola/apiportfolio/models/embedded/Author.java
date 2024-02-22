package com.nexola.apiportfolio.models.embedded;

import com.nexola.apiportfolio.models.entities.User;

public class Author {
    private String id;
    private String name;
    private String email;

    public Author(){}

    public Author(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Author(User entity) {
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
