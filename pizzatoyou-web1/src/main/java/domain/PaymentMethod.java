package domain;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentMethod {

    VISA_DEBIT("Visa Debit"),
    MASTERCARD_DEBIT("Mastercard Debit"),
    MAESTRO_DEBIT("Maestro Debit"),
    VISA_CREDIT("Maestro Debit"),
    MASTERCARD_CREDIT("Maestro Debit"),
    AMERICAN_EXPRESS("American Express");

    private String text;

    PaymentMethod(String text) {
        this.text = text;
    }

    @JsonValue
    public String getText() {
        return text;
    }
}
