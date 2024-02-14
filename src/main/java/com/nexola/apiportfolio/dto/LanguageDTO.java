package com.nexola.apiportfolio.dto;

import com.nexola.apiportfolio.entities.Language;
import com.nexola.apiportfolio.entities.LanguageLevel;

public class LanguageDTO {
    private Long id;
    private String language;
    private LanguageLevel level;

    public LanguageDTO(){}

    public LanguageDTO(Long id, String language, LanguageLevel level) {
        this.id = id;
        this.language = language;
        this.level = level;
    }

    public LanguageDTO(Language entity) {
        id = entity.getId();
        language = entity.getLanguage();
        level = entity.getLevel();
    }

    public Long getId() {
        return id;
    }

    public String getLanguage() {
        return language;
    }

    public LanguageLevel getLevel() {
        return level;
    }
}
