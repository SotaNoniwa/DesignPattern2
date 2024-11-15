package com.factories.simpleFactory;

public class BurgerTestDrive {

    public static void main(String[] args) {
        BurgerShop shop  = new BurgerShop();
        Burger burger = shop.orderBurger(BurgerType.VEGGIE);
        System.out.println(burger);
    }
}
