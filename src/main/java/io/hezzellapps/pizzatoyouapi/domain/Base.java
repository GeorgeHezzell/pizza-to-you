package io.hezzellapps.pizzatoyouapi.domain;

import lombok.Data;

@Data
public class Base {

    private String id;
    private String name;

    public static Base from(String id,
                            String name) {
        var b = new Base();
        b.setId(id);
        b.setName(name);

        return b;
    }

}
