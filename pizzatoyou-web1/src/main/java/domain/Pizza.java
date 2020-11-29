package domain;

import lombok.Data;

import java.util.List;

@Data
public class Pizza {

    private String id;
    private String name;
    private List<Topping> toppings;
    private int inches;
    private Base base;
    private Crust crust;

    public static Pizza from(
            String id,
            String name,
            List<Topping> toppings,
            int inches,
            Base base,
            Crust crust) {
        var p = new Pizza();
        p.setId(id);
        p.setName(name);
        p.setToppings(toppings);
        p.setInches(inches);
        p.setBase(base);
        p.setCrust(crust);

        return p;

    }

}
