package com.factories.simpleFactory;

import java.util.List;

// Concrete product
public class FishBurger extends Burger {

    public FishBurger() {
        burgerType = BurgerType.FISH;
        List<String> items = List.of("red onion slices", "lettuce", "tartar sauce");
        toppings.addAll(items);
    }

    // FishBurger-specific implementation
    @Override
    public void prepareBun() {
        System.out.println("Preparing a bun with sesame seeds");
    }
}
