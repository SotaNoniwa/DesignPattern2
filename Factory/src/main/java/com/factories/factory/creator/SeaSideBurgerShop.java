package com.factories.factory.creator;

import com.factories.factory.product.Burger;
import com.factories.factory.BurgerType;
import com.factories.factory.product.SeaSideStyleBeefBurger;
import com.factories.factory.product.SeaSideStyleFishBurger;

public class SeaSideBurgerShop extends BurgerShop {

    @Override
    public Burger createBurger(BurgerType type) {
        return switch (type) {
            case BEEF -> new SeaSideStyleBeefBurger();
            case FISH -> new SeaSideStyleFishBurger();
            default -> throw new IllegalArgumentException("unknown seaside burger type");
        };
    }
}
