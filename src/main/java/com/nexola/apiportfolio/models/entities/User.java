package com.nexola.apiportfolio.models.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.sound.sampled.Port;
import java.util.Objects;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;

    @DBRef(lazy = true)
    private Portfolio portfolio;

    public User(){}

    public User(String id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public User(String id, String email, String password, Portfolio portfolio) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.portfolio = portfolio;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
