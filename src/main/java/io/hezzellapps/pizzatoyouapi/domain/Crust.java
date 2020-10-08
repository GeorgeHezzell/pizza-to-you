package io.hezzellapps.pizzatoyouapi.domain;

import lombok.Data;

@Data
public class Crust {

    private String id;
    private String name;

    public static Crust from(String id,
                             String name) {
        var c = new Crust();
        c.setId(id);
        c.setName(name);

        return c;
    }
}
