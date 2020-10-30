package io.hezzellapps.pizzatoyouapi.domain;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;


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
