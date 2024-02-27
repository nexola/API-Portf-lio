package com.nexola.apiportfolio.models.dto;

import com.nexola.apiportfolio.models.embedded.*;
import com.nexola.apiportfolio.models.entities.Portfolio;
import com.nexola.apiportfolio.models.entities.User;

public class PortfolioDTO {
    private String id;
    private Header header;
    private Footer footer;
    private Experience experience;
    private Education education;
    private Author author;

    public PortfolioDTO(){}

    public PortfolioDTO(Portfolio entity) {
        id = entity.getId();
        header = entity.getHeader();
        footer = entity.getFooter();
        experience = entity.getExperience();
        education = entity.getEducation();
        author = entity.getAuthor();
    }

    public PortfolioDTO(String id, Header header, Footer footer, Experience experience, Education education, Author author) {
        this.id = id;
        this.header = header;
        this.footer = footer;
        this.experience = experience;
        this.education = education;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public Header getHeader() {
        return header;
    }

    public Footer getFooter() {
        return footer;
    }

    public Experience getExperience() {
        return experience;
    }

    public Education getEducation() {
        return education;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }
}
