package com.factories.factory.creator;

import com.factories.factory.product.Burger;
import com.factories.factory.BurgerType;

public abstract class BurgerShop {

    // This method provides a framework for each burger shops to order burgers
    public Burger orderBurger(BurgerType type) {
        Burger burger = createBurger(type);

        burger.prepareBun();
        burger.grillPatty();
        burger.addToppings();
        burger.wrap();

        return burger;
    }

    // This is our factory method. Subclasses will override this method,
    // provide their own implementation, determine which kind of burger gets made.
    public abstract Burger createBurger(BurgerType type);
}
