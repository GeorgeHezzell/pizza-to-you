package io.hezzellapps.pizzatoyouapi.domain;

import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
public class Basket {

    private String id;
    private String userId;
    private Instant createdDate;
    private List<BasketItem> items;

    public static Basket from(String id,
                              String userId,
                              Instant createdDate,
                              List<BasketItem> items) {

        var b = new Basket();
        b.setId(id);
        b.setUserId(userId);
        b.setCreatedDate(createdDate);
        b.setItems(items);

        return b;
    }

}
