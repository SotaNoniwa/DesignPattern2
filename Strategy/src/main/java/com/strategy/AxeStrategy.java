package com.strategy;

/*
Concrete strategy
 */
public class AxeStrategy implements WeaponStrategy {

    @Override
    public void useWeapon() {
        System.out.println("Chopping with an axe!");
    }
}
