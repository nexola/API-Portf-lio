package com.nexola.apiportfolio;

import com.nexola.apiportfolio.entities.Certificate;
import com.nexola.apiportfolio.entities.Complementary;
import com.nexola.apiportfolio.entities.Diploma;
import com.nexola.apiportfolio.entities.Language;
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
    private List<Complementary> complementaries = new ArrayList<>();

    @OneToMany(mappedBy = "education")
    private Set<Language> languages = new HashSet<>();

    public Education() {
    }

    public Education(Long id, String description) {
        this.id = id;
        this.description = description;
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

    public List<Complementary> getComplementaries() {
        return complementaries;
    }

    public Set<Language> getLanguages() {
        return languages;
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
