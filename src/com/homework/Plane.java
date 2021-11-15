package com.homework;

public class Plane extends Vehicle {
    private final float height;
    private final byte passengers;

    public Plane(float height, byte passengers) {
        super("50,4547N, 30,5238E", 50500.50f, (short) 400, (short) 2020);
        this.height = height;
        this.passengers = passengers;
    }

    public float getHeight() {
        return height;
    }

    public byte getPassengers() {
        return passengers;
    }

    static void showInfo(Plane vehicle) {
        System.out.println((char) 27 + "[36m"+"Літак \uD83D\uDEE9");
        System.out.println("Координати: " + vehicle.getCoordinates());
        System.out.println("Ціна: " + vehicle.getPrice() + "$");
        System.out.println("Швидкість: " + vehicle.getSpeed() + "км/год");
        System.out.println("Рік випуску: " + vehicle.getYear());
        System.out.println("Висота польоту: " + vehicle.getHeight() + "км");
        System.out.println("Кількість пасажирів: " + vehicle.getPassengers());
        System.out.println("---------------");
    }
}
