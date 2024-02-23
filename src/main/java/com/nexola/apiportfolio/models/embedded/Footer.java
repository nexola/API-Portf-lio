package com.nexola.apiportfolio.models.embedded;

public class Footer {
    private String description;
    private String email;
    private String phone;
    private String instagram;
    private String instagramUser;
    private String github;
    private String linkedin;
    private String curriculum;

    public Footer(){}

    public Footer(String description, String email, String phone, String instagram, String instagramUser, String github, String linkedin, String curriculum) {
        this.description = description;
        this.email = email;
        this.phone = phone;
        this.instagram = instagram;
        this.instagramUser = instagramUser;
        this.github = github;
        this.linkedin = linkedin;
        this.curriculum = curriculum;
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
}
