package com.singletons;

public class EagerInstantiationSingleton {

    private static EagerInstantiationSingleton instance = new EagerInstantiationSingleton();

    private EagerInstantiationSingleton() {
    }

    public static EagerInstantiationSingleton getInstance() {
        return instance;
    }
}
