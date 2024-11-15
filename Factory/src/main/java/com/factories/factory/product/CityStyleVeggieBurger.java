package com.factories.factory.product;

import com.factories.factory.BurgerType;

import java.util.List;

public class CityStyleVeggieBurger extends Burger {

    public CityStyleVeggieBurger() {
        type = BurgerType.VEGGIE;
        List<String> items = List.of("smoked paprika", "garlic chips", "crushed walnuts", "veggie sauce");
        toppings.addAll(items);
    }
}
