package com.strategy;

/*
Content in Strategy pattern
 */
public abstract class Hero {

    private WeaponStrategy weapon;

    public Hero() {
        this.weapon = new NoWeaponStrategy();
    }

    public abstract void greet();

    public void surrender() {
        System.out.println("You lose");
    }

    public WeaponStrategy getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponStrategy weapon) {
        this.weapon = weapon;
    }
}
