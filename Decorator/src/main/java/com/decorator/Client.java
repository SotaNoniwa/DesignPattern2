package com.decorator;

public class Client {

    public static void main(String[] args) {
        IceCream iceCream = new ChocolateIceCream();
        System.out.println(iceCream.getDescription() + ", $" + iceCream.cost());

        iceCream = new MapleNuts(iceCream);
        System.out.println(iceCream.getDescription() + ", $" + iceCream.cost());

        iceCream = new PeanutButterShell(iceCream);
        System.out.println(iceCream.getDescription() + ", $" + iceCream.cost());
    }
}
