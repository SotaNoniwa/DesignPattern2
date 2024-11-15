package com.factories.factory;

import com.factories.factory.creator.BurgerShop;
import com.factories.factory.creator.CityBurgerShop;
import com.factories.factory.creator.SeaSideBurgerShop;
import com.factories.factory.product.Burger;

public class BurgerTestDrive {

    public static void main (String[] args ) {
        BurgerShop cityShop = new CityBurgerShop();
        Burger cityStyleBeefBurger = cityShop.orderBurger(BurgerType.BEEF);
        System.out.println(cityStyleBeefBurger);

        System.out.println("**********************");
        BurgerShop seasideBurger = new SeaSideBurgerShop();
        Burger seasideStyleBeefBurger = seasideBurger.orderBurger(BurgerType.BEEF);
        System.out.println(seasideStyleBeefBurger);
    }
}
