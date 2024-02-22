package com.nexola.apiportfolio.models.embedded;

import com.nexola.apiportfolio.models.enums.LanguageLevel;

public class Language {
    private String language;
    private LanguageLevel level;

    public Language(){}

    public Language(String language, LanguageLevel level) {
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public LanguageLevel getLevel() {
        return level;
    }

    public void setLevel(LanguageLevel level) {
        this.level = level;
    }
}
