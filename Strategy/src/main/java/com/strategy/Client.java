package com.strategy;

/*
Client can use different strategies (or algorithms) dynamically
 */
public class Client {

    public static void main(String[] args) {
        Hero warrior = new Warrior();
        // warrior hasn't equipped a weapon
        warrior.getWeapon().useWeapon();
        // warrior equips an axe
        warrior.setWeapon(new AxeStrategy());
        warrior.getWeapon().useWeapon();
    }
}
