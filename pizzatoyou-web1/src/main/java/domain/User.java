package domain;

import lombok.Data;

import java.time.Instant;

@Data
public class User {

    private String id;
    private String firstName;
    private String lastName;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String county;
    private String postCode;
    private String email;
    private String phoneNumber;
    private Instant createdDate;

}
