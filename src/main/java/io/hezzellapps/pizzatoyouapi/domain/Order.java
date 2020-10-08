package io.hezzellapps.pizzatoyouapi.domain;

import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
public class Order {

    private String id;
    private double cost;
    private List<Pizza> pizzas;
    private Instant orderDate;
    private String userId;
    private String shopId;
    private OrderStatus status;

    public static Order from(String id,
                             double cost,
                             List<Pizza> pizzas,
                             Instant orderDate,
                             String customerId,
                             String shopId,
                             OrderStatus status) {

        var o = new Order();
        o.setId(id);
        o.setCost(cost);
        o.setPizzas(pizzas);
        o.setOrderDate(orderDate);
        o.setUserId(customerId);
        o.setShopId(shopId);
        o.setStatus(status);

        return o;

    }
}
