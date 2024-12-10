package com.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HolderInvocationHandler implements InvocationHandler {

    private IBankAccount account;

    public HolderInvocationHandler(IBankAccount account) {
        this.account = account;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            return method.invoke(account, args);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
