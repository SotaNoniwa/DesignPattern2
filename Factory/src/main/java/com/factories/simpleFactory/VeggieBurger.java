package com.factories.simpleFactory;

import java.util.List;

// Concrete product
public class VeggieBurger extends Burger {

    public VeggieBurger() {
        burgerType = BurgerType.VEGGIE;
        List<String> items = List.of("smoked paprika", "garlic chips", "crushed walnuts", "veggie sauce");
        toppings.addAll(items);
    }

    // Concrete product can implement specific behavior that differs from other products
    @Override
    public void wrap() {
        System.out.println("Wrapping paper shouldn't print any meats but vegetables");
    }
}
