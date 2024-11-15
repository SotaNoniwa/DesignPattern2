package com.factories.factory.product;

import com.factories.factory.BurgerType;

import java.util.List;

public class SeaSideStyleBeefBurger extends Burger {

    public SeaSideStyleBeefBurger() {
        type = BurgerType.BEEF;
        // Localized toppings for beef burger in seaside area
        List<String> items = List.of("lettuce", "pickle slices", "tomato slice", "salty sauce");
        toppings.addAll(items);
    }

    // Uses localized wrapping paper
    @Override
    public void wrap() {
        System.out.println("Wrap with a paper with nice sea scenery");
    }
}
