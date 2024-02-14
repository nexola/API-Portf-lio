package com.nexola.apiportfolio.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_footer")
public class Footer {
    @Id
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String email;
    private String phone;
    private String instagram;
    private String instagramUser;
    private String github;
    private String linkedin;
    private String curriculum;

    @OneToOne
    @MapsId
    private User user;

    public Footer() {}

    public Footer(Long id, String description, String email, String phone, String instagram, String github, String linkedin, String curriculum, String instagramUser, User user) {
        this.id = id;
        this.description = description;
        this.email = email;
        this.phone = phone;
        this.instagram = instagram;
        this.github = github;
        this.linkedin = linkedin;
        this.curriculum = curriculum;
        this.instagramUser = instagramUser;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getInstagramUser() {
        return instagramUser;
    }

    public void setInstagramUser(String instagramUser) {
        this.instagramUser = instagramUser;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Footer footer = (Footer) o;

        return Objects.equals(id, footer.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
