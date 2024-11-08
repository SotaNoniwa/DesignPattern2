package com.factories.simpleFactory;

import java.util.ArrayList;
import java.util.List;

// Abstract Product
public abstract class Burger {

    public BurgerType burgerType;
    public List<String> toppings = new ArrayList<>();

    public void prepareBun() {
        System.out.println("Preparing a bun");
    }

    public void grillPatty() {
        if (burgerType == null) {
            throw new IllegalStateException("pattyType is undefined");
        }
        System.out.println("Grill a " + burgerType + " patty");
    }

    public void addToppings() {
        for (String item : toppings) {
            System.out.println("Add " + item);
        }
    }

    public void wrap() {
        System.out.println("Wrap a burger up");
    }
}
