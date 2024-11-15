package com.factories.simpleFactory;

// This is our Client
public class BurgerShop {

    public Burger orderBurger(BurgerType type) {
        // Factory is responsible for object creation
        Burger burger = SimpleBurgerFactory.createBurger(type);

        burger.prepareBun();
        burger.grillPatty();
        burger.addToppings();
        burger.wrap();

        return burger;
    }
}
