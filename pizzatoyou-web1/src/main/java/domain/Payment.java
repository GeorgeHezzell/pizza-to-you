package domain;

import lombok.Data;

@Data
public class Payment {

    private String id;
    private String createdDate;
    private PaymentMethod paymentMethod;
    private String cardMask;
}
