package com.strategy;

/*
Concrete strategy
 */
public class NoWeaponStrategy implements WeaponStrategy {

    @Override
    public void useWeapon() {
        System.out.println("Can't attack, you need a weapon!");
    }
}
