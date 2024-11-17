package com.factories.abstractFactory.factory;

import com.factories.abstractFactory.product.Button;
import com.factories.abstractFactory.product.Menu;
import com.factories.abstractFactory.product.Toolbar;

public interface ThemeFactory {

    Button createButton();

    Menu createMenu();

    Toolbar createToolbar();
}
