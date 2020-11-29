package domain;

import lombok.Data;

import java.util.List;

@Data
public class Deal {

    private String id;
    private String name;
    private double cost;
    private List<Pizza> pizzas;

}
