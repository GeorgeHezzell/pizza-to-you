package io.hezzellapps.pizzatoyouapi.domain;

import lombok.Data;

@Data
public class BasketItem {

    private int quantity;
    private Pizza pizza;

    public static BasketItem from (int quantity,
                                   Pizza pizza){
        var bi = new BasketItem();
        bi.setQuantity(quantity);
        bi.setPizza(pizza);

        return bi;
    }
}
