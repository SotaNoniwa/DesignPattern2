package com.factories.simpleFactory;

import java.util.List;

// Concrete product
public class ChickenBurger extends Burger {

    public ChickenBurger() {
        burgerType = BurgerType.CHICKEN;
        List<String> items = List.of("lettuce", "onion slices", "chill sauce");
        toppings.addAll(items);
    }
}
