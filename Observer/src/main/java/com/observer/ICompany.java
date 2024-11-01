package com.observer;

public interface ICompany {

    void registerAccount(IAccount account);

    void removeAccount(IAccount account);

    void notifyAccounts();
}
