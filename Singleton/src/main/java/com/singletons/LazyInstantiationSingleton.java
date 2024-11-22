package com.singletons;

public class LazyInstantiationSingleton {

    private static LazyInstantiationSingleton instance;

    private LazyInstantiationSingleton() {
    }

    public static synchronized LazyInstantiationSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInstantiationSingleton();
        }
        return instance;
    }
}
