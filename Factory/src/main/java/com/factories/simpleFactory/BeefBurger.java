package com.factories.simpleFactory;

import java.util.List;

// Concrete product
public class BeefBurger extends Burger {

    public BeefBurger() {
        burgerType = BurgerType.BEEF;
        List<String> items = List.of("lettuce", "pickle slices", "tomato slice", "BBQ sauce");
        toppings.addAll(items);
    }
}
