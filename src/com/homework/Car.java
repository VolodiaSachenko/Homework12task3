package com.homework;

public class Car extends Vehicle {
    private final String color;

    public Car(String color) {
        super("50,4547°N, 30,5238°E", 5700.40f, (short) 230, (short) 2010);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    static void showInfo(Car vehicle) {
        System.out.println("Автомобіль \uD83D\uDE97");
        System.out.println("Координати: " + vehicle.getCoordinates());
        System.out.println("Ціна: " + vehicle.getPrice() + "$");
        System.out.println("Швидкість: " + vehicle.getSpeed() + "км/год");
        System.out.println("Рік випуску: " + vehicle.getYear());
        System.out.println("Колір: " + vehicle.getColor());
        System.out.println("---------------");
    }
}
