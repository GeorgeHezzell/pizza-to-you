package io.hezzellapps.pizzatoyouapi.domain;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SpiceRating {

    PLAIN("Plain"), MILD("Mild"), HOT("Hot"), EXTRA_HOT("Extra Hot");

    private String text;

    SpiceRating( String text) {

        this.text = text;
    }

    @JsonValue
    public String getText() {
        return text;
    }
}
