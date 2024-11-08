package com.factories.simpleFactory;

public class Client {

    public static void main(String[] args) {
        Burger burger = orderBurger(BurgerType.VEGGIE);
        System.out.println(burger);
    }

    public static Burger orderBurger(BurgerType type) {
        // Factory is responsible for object creation
        Burger burger = SimpleBurgerFactory.createBurger(type);

        burger.prepareBun();
        burger.grillPatty();
        burger.addToppings();
        burger.wrap();

        return burger;
    }
}
