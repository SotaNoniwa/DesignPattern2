package com.observer;

import java.util.ArrayList;
import java.util.List;

public class Company implements ICompany {

    private List<IAccount> followers;

    private String name;

    private String saleItem;

    public Company(String name) {
        followers = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void registerAccount(IAccount account) {
        this.followers.add(account);
    }

    @Override
    public void removeAccount(IAccount account) {
        this.followers.remove(account);
    }

    @Override
    public void notifyAccounts() {
        for (IAccount follower : followers) {
            follower.update(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSaleItem() {
        return saleItem;
    }

    public void setSaleItem(String saleItem) {
        this.saleItem = saleItem;
        saleItemChanged();
    }

    public void saleItemChanged() {
        notifyAccounts();
    }
}
