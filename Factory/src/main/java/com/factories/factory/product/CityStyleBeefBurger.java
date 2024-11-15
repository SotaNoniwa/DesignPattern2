package com.factories.factory.product;

import com.factories.factory.BurgerType;

import java.util.List;

public class CityStyleBeefBurger extends Burger {

    public CityStyleBeefBurger() {
        type = BurgerType.BEEF;
        List<String> items = List.of("lettuce", "pickle slices", "tomato slice", "BBQ sauce");
        toppings.addAll(items);
    }
}
