package com.singletons;

public enum EnumSingleton {
    INSTANCE;

    // You can see JVM will call constructor
//    private EnumSingleton() {
//        System.out.println("JVM instantiates EnumSingleton object");
//    }
}
