package io.hezzellapps.pizzatoyouapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.hezzellapps.pizzatoyouapi.domain.*;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Arrays;
import java.util.UUID;

public class Testy {

    @Test
    public void test() throws JsonProcessingException {

        var shop = new Shop();
        shop.setId(UUID.randomUUID().toString());
        shop.setName("Dominoes");
        shop.setAddressLine1("1 The High Street");
        shop.setCity("Camberley");
        shop.setCounty("Surrey");
        shop.setPostCode("GU168AB");
        shop.setLongitude(-0.72980);
        shop.setLatitude(51.31402);


        var deal = new Deal();
        deal.setId(UUID.randomUUID().toString());
        deal.setCost(19.99);
        deal.setName("Family Feast");
        deal.setPizzas(Arrays.asList(
                Pizza.from(UUID.randomUUID().toString(),
                        "Large Pepperoni",
                        Arrays.asList(Topping.from(UUID.randomUUID().toString(), "Pepperoni", false, SpiceRating.MILD)),
                        12,
                        Base.from(UUID.randomUUID().toString(), "Tomato"),
                        Crust.from(UUID.randomUUID().toString(), "Classic")),
                        Pizza.from(UUID.randomUUID().toString(),
                                "Large Chicken",
                                Arrays.asList(Topping.from(UUID.randomUUID().toString(), "Chicken", false, SpiceRating.MILD)),
                                12,
                                Base.from(UUID.randomUUID().toString(), "Tomato"),
                                Crust.from(UUID.randomUUID().toString(), "Classic")
                        )
                ));

        var order = new Order();
        order.setId(UUID.randomUUID().toString());
        order.setCost(19.99);
        order.setPizzas(Arrays.asList(
                Pizza.from(UUID.randomUUID().toString(),
                        "Large Pepperoni",
                        Arrays.asList(Topping.from(UUID.randomUUID().toString(), "Pepperoni", false, SpiceRating.MILD)),
                        12,
                        Base.from(UUID.randomUUID().toString(), "Tomato"),
                        Crust.from(UUID.randomUUID().toString(), "Classic")),
                Pizza.from(UUID.randomUUID().toString(),
                        "Large Chicken",
                        Arrays.asList(Topping.from(UUID.randomUUID().toString(), "Chicken", false, SpiceRating.MILD)),
                        12,
                        Base.from(UUID.randomUUID().toString(), "Tomato"),
                        Crust.from(UUID.randomUUID().toString(), "Classic")
                )
        ));
        order.setUserId(UUID.randomUUID().toString());
        order.setShopId(UUID.randomUUID().toString());
        order.setStatus(OrderStatus.DELIVERED);
        order.setOrderDate(Instant.now());

        var b = Basket.from(
                UUID.randomUUID().toString(),
                UUID.randomUUID().toString(),
                Instant.now(),
                Arrays.asList(
                        BasketItem.from(1, Pizza.from(UUID.randomUUID().toString(),
                                "Large Pepperoni",
                                Arrays.asList(Topping.from(UUID.randomUUID().toString(), "Pepperoni", false, SpiceRating.MILD)),
                                12,
                                Base.from(UUID.randomUUID().toString(), "Tomato"),
                                Crust.from(UUID.randomUUID().toString(), "Classic")))
                )
        );


        var om = new ObjectMapper();
        om.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        JavaTimeModule module = new JavaTimeModule();
        om.registerModule(module);

        var json = om.writeValueAsString(b);
    }
}
