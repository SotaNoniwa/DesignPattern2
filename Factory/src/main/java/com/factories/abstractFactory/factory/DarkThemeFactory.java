package com.factories.abstractFactory.factory;

import com.factories.abstractFactory.product.*;

public class DarkThemeFactory implements ThemeFactory {

    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Menu createMenu() {
        return new DarkMenu();
    }

    @Override
    public Toolbar createToolbar() {
        return new DarkToolbar();
    }
}
