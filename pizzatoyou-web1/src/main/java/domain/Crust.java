package domain;

import com.fasterxml.jackson.annotation.JsonValue;


public enum Crust {

    CLASSIC("Classic"), THIN("Thin"), THICK("Thick");

    private String text;

    Crust( String text) {

        this.text = text;
    }

    @JsonValue
    public String getText() {
        return text;
    }
}
