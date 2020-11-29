package domain;

import lombok.Data;

@Data
public class Topping {

    private String id;
    private String name;
    private boolean isVeggie;
    private SpiceRating spiceRating;

    public static Topping from(String id,
                               String name,
                               boolean isVeggie,
                               SpiceRating spiceRating) {
        var t = new Topping();
        t.setId(id);
        t.setName(name);
        t.setVeggie(isVeggie);
        t.setSpiceRating(spiceRating);

        return t;

    }
}
