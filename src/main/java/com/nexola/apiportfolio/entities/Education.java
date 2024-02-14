package com.nexola.apiportfolio.entities;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "tb_education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String description;

    @OneToMany(mappedBy = "education")
    private List<Diploma> diplomas = new ArrayList<>();

    @OneToMany(mappedBy = "education")
    private List<Certificate> certificates = new ArrayList<>();

    @OneToMany(mappedBy = "education")
    private List<Complementary> courses = new ArrayList<>();

    @OneToMany(mappedBy = "education")
    private Set<Language> languages = new HashSet<>();

    @OneToOne
    @MapsId
    private User user;

    public Education() {
    }

    public Education(Long id, String description, User user) {
        this.id = id;
        this.description = description;
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

    public List<Diploma> getDiplomas() {
        return diplomas;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public List<Complementary> getCourses() {
        return courses;
    }

    public Set<Language> getLanguages() {
        return languages;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Education education = (Education) o;

        return Objects.equals(id, education.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
