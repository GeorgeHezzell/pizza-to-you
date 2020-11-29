package domain;

import lombok.Data;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Data
public class Basket {

    private int id;
    private String sessionId;
    private Instant createdDate;
    private List<BasketItem> items;

    public Basket(){
        this.items = new ArrayList<>();
    }

    public static Basket from(int id,
                              String userId,
                              Instant createdDate,
                              List<BasketItem> items) {

        var b = new Basket();
        b.setId(id);
        b.setSessionId(userId);
        b.setCreatedDate(createdDate);
        b.setItems(items);

        return b;
    }

    public void addBasketItem(BasketItem bi){
        this.items.add(bi);
    }

}
