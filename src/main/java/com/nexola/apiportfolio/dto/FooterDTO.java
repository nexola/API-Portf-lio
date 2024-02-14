package com.nexola.apiportfolio.dto;

import com.nexola.apiportfolio.entities.Footer;

public class FooterDTO {
    private String description;
    private String email;
    private String phone;
    private String instagram;
    private String instagramUser;
    private String github;
    private String linkedin;
    private String curriculum;

    public FooterDTO() {
    }

    public FooterDTO(String description, String email, String phone, String instagram, String instagramUser, String github, String linkedin, String curriculum) {
        this.description = description;
        this.email = email;
        this.phone = phone;
        this.instagram = instagram;
        this.instagramUser = instagramUser;
        this.github = github;
        this.linkedin = linkedin;
        this.curriculum = curriculum;
    }

    public FooterDTO(Footer entity) {
        description = entity.getDescription();
        email = entity.getEmail();
        phone = entity.getPhone();
        instagram = entity.getInstagram();
        instagramUser = entity.getInstagramUser();
        github = entity.getGithub();
        linkedin = entity.getLinkedin();
        curriculum = entity.getCurriculum();
    }

    public String getDescription() {
        return description;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getInstagram() {
        return instagram;
    }

    public String getInstagramUser() {
        return instagramUser;
    }

    public String getGithub() {
        return github;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public String getCurriculum() {
        return curriculum;
    }
}
