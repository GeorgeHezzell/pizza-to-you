package domain;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Base {


    TOMATO( "Tomato"), BARBEQUE("Barbeque");

    private String text;

    Base(String text) {
        this.text = text;
    }

    @JsonValue
    public String getText() {
        return text;
    }

}
