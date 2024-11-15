package com.factories.factory.product;

import com.factories.factory.BurgerType;

import java.util.List;

public class SeaSideStyleFishBurger extends Burger {

    public SeaSideStyleFishBurger() {
        type = BurgerType.FISH;
        // Localized toppings for fish burger in seaside area
        List<String> items = List.of("red onion slices", "salty sauce", "fried shrimps");
        toppings.addAll(items);
    }

    // Uses localized wrapping paper
    @Override
    public void wrap() {
        System.out.println("Wrap with a paper with nice sea scenery");
    }
}
