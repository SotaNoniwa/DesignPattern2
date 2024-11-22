package com.singletons;

public class Client {

    public static void main(String[] args) {
        LazyInstantiationSingleton singleton1 = LazyInstantiationSingleton.getInstance();
        System.out.println(singleton1);

        EagerInstantiationSingleton singleton2 = EagerInstantiationSingleton.getInstance();
        System.out.println(singleton2);

        DoubleCheckedLockingSingleton singleton3 = DoubleCheckedLockingSingleton.getInstance();
        System.out.println(singleton3);

        EnumSingleton singleton4 = EnumSingleton.INSTANCE;
        System.out.println(singleton4);
    }
}
