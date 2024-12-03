package com.facade;

public class NavigationScreen {

    private GPS gps;

    public NavigationScreen(GPS gps) {
        this.gps = gps;
    }

    public void on() {
        System.out.println("Navigation screen displays gps: " + gps.getLongitude() + ", " + gps.getLatitude());
    }

    public void off() {
        System.out.println("Navigation screen is off");
    }
}
