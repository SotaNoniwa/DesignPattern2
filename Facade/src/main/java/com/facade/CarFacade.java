package com.facade;

public class CarFacade {

    private DashBoard dashBoard;
    private Door door;
    private Engine engine;
    private HeadLight light;
    private NavigationScreen screen;

    private boolean isOutsideDark;

    public CarFacade(DashBoard dashBoard,
                     Door door,
                     Engine engine,
                     HeadLight light,
                     NavigationScreen screen,
                     boolean isOutsideDark) {
        this.dashBoard = dashBoard;
        this.door = door;
        this.engine = engine;
        this.light = light;
        this.screen = screen;
        this.isOutsideDark = isOutsideDark;
    }

    public void startDriving() {
        door.unlock();
        door.open();
        engine.start();
        dashBoard.on();
        screen.on();
        if (isOutsideDark) {
            light.on();
        }
        door.close();
        door.lock();
    }

    public void endDriving() {
        light.off();
        screen.off();
        dashBoard.off();
        engine.stop();
        door.unlock();
        door.open();
    }
}
