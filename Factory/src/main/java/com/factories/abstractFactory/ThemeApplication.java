package com.factories.abstractFactory;

import com.factories.abstractFactory.factory.ThemeFactory;
import com.factories.abstractFactory.product.Button;
import com.factories.abstractFactory.product.Menu;
import com.factories.abstractFactory.product.Toolbar;

// This is our client code, notice client sees neither concrete products nor concrete factories
public class ThemeApplication {

    private ThemeFactory themeFactory;
    private Button button;
    private Menu menu;
    private Toolbar toolbar;

    public ThemeApplication(ThemeFactory factory) {
        themeFactory = factory;
        createComponents();
    }

    public void createComponents() {
        button = themeFactory.createButton();
        menu = themeFactory.createMenu();
        toolbar = themeFactory.createToolbar();
    }

    public void renderComponents() {
        button.render();
        menu.render();
        toolbar.render();
    }
}
