package com.strategy;

/*
Concrete strategy
 */
public class SwordStrategy implements WeaponStrategy {

    @Override
    public void useWeapon() {
        System.out.println("Swinging a sword!");
    }
}
