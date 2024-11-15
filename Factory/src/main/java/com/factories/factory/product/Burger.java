package com.factories.factory.product;

import com.factories.factory.BurgerType;

import java.util.ArrayList;
import java.util.List;

public abstract class Burger {
    public BurgerType type;
    public List<String> toppings = new ArrayList<>();

    public void prepareBun() {
        System.out.println("Preparing a bun");
    }

    public void grillPatty() {
        if (type == null) {
            throw new IllegalStateException("pattyType is undefined");
        }
        System.out.println("Grill a " + type + " patty");
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
