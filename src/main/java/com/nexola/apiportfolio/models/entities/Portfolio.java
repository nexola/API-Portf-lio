package com.nexola.apiportfolio.models.entities;

import com.nexola.apiportfolio.models.embedded.Education;
import com.nexola.apiportfolio.models.embedded.Experience;
import com.nexola.apiportfolio.models.embedded.Footer;
import com.nexola.apiportfolio.models.embedded.Header;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Portfolio {
    @Id
    private String id;

    private Header header;
    private Footer footer;
    private Experience experience;
    private Education education;
    private User author;

    public Portfolio(){}

    public Portfolio(String id, Header header, Footer footer, Experience experience, Education education, User author) {
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

    public void setId(String id) {
        this.id = id;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Footer getFooter() {
        return footer;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Portfolio portfolio = (Portfolio) o;
        return Objects.equals(id, portfolio.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
