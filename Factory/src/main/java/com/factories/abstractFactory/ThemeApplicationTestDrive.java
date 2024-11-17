package com.factories.abstractFactory;

import com.factories.abstractFactory.factory.DarkThemeFactory;
import com.factories.abstractFactory.factory.LightThemeFactory;
import com.factories.abstractFactory.factory.ThemeFactory;

public class ThemeApplicationTestDrive {

    public static void main (String[] args) {
        ThemeFactory darkFactory = new DarkThemeFactory();
        ThemeApplication app1 = new ThemeApplication(darkFactory);
        app1.renderComponents();
        System.out.println("*******************");

        ThemeFactory lightFactory = new LightThemeFactory();
        ThemeApplication app2 = new ThemeApplication(lightFactory);
        app2.renderComponents();
    }
}
