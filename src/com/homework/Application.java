package com.homework;

/**
 * @author Volodia Sachenko
 * @version 0.1
 * @since 14.11.21
 */

public class Application {
    public static void main(String[] args) {
        Plane plane = new Plane(4.3f, (byte) 30);
        Car car = new Car("red");
        Ship ship = new Ship((short) 240, "Port of Jamaica");
        Plane.showInfo(plane);
        Car.showInfo(car);
        Ship.showInfo(ship);
    }
}
