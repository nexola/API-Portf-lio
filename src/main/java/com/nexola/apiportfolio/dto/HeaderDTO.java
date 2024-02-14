package com.nexola.apiportfolio.dto;

import com.nexola.apiportfolio.entities.Header;

public class HeaderDTO {
    private String title;
    private String state;

    public HeaderDTO(){}

    public HeaderDTO(String title, String state) {
        this.title = title;
        this.state = state;
    }

    public HeaderDTO(Header entity) {
        title = entity.getTitle();
        state = entity.getState();
    }

    public String getTitle() {
        return title;
    }

    public String getState() {
        return state;
    }
}
