package domain;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderStatus {

    CREATED("Created"),BEING_PREPARED("Being Prepared"),OUT_FOR_DELIVERY("Out for delivery"),DELIVERED("Delivered");

    private String text;

    OrderStatus(String text) {
        this.text = text;
    }

    @JsonValue
    public String getText() {
        return text;
    }
}
