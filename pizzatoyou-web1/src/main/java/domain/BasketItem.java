package domain;

import lombok.Data;

@Data
public class BasketItem {

    private int id;
    private int quantity;
    private int pizzaId;
    private Pizza pizza;

    public static BasketItem from(int id,
                                  int quantity,
                                  int pizzaId,
                                  Pizza pizza) {
        var bi = new BasketItem();
        bi.setId(id);
        bi.setQuantity(quantity);
        bi.setPizzaId(pizzaId);
        bi.setPizza(pizza);

        return bi;
    }
}
