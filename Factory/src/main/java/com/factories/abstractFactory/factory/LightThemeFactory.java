package com.factories.abstractFactory.factory;

import com.factories.abstractFactory.product.*;

public class LightThemeFactory implements ThemeFactory {

    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Menu createMenu() {
        return new LightMenu();
    }

    @Override
    public Toolbar createToolbar() {
        return new LightToolbar();
    }
}
