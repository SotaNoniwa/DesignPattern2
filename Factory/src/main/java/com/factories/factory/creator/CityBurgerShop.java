package com.factories.factory.creator;

import com.factories.factory.product.Burger;
import com.factories.factory.BurgerType;
import com.factories.factory.product.CityStyleBeefBurger;
import com.factories.factory.product.CityStyleVeggieBurger;

public class CityBurgerShop extends BurgerShop {

    @Override
    public Burger createBurger(BurgerType type) {
        return switch (type) {
            case BEEF -> new CityStyleBeefBurger();
            case VEGGIE -> new CityStyleVeggieBurger();
            default -> throw new IllegalArgumentException("unknown city burger type");
        };
    }
}
