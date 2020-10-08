package io.hezzellapps.pizzatoyouapi.domain;

import lombok.Data;

@Data
public class Shop {
    private String id;
    private String name;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String county;
    private String postCode;
    private double longitude;
    private double latitude;
}
