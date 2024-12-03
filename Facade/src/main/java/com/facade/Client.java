package com.facade;

public class Client {

    public static void main(String[] args) {
        // Create components
        DashBoard dashBoard = new DashBoard();
        Door door = new Door();
        Engine engine = new Engine();
        HeadLight light = new HeadLight();
        GPS gps = new GPS();
        NavigationScreen screen = new NavigationScreen(gps);

        // Instantiates Facade with all the components in the subsystem
        CarFacade automatedCar = new CarFacade(dashBoard, door, engine, light, screen, true);

        // Use the simplified interface to start and end driving
        automatedCar.startDriving();
        System.out.println();
        automatedCar.endDriving();
    }
}
