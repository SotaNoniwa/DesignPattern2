package com.factories.simpleFactory;

// Simple factory, responsible for instantiating an object
public class SimpleBurgerFactory {

    public static Burger createBurger(BurgerType type) {
        return switch (type) {
            case BEEF -> new BeefBurger();
            case CHICKEN -> new ChickenBurger();
            case FISH -> new FishBurger();
            case VEGGIE -> new VeggieBurger();
            default -> throw new IllegalArgumentException("unknown burger type");
        };
    }
}
