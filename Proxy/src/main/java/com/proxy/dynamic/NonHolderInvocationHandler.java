package com.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonHolderInvocationHandler implements InvocationHandler {

    private IBankAccount account;

    public NonHolderInvocationHandler(IBankAccount account) {
        this.account = account;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            // Anyone can access to other person's name and account number
            if (method.getName().startsWith("get")) {
                method.invoke(account, args);
            } else {
                // Other methods like deposit() are not allowed by anyone but account holder
                throw new IllegalAccessException();
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
