package com.homework;

public class Vehicle {
    private final String coordinates;
    private final float price;
    private final short speed;
    private final short year;

    public Vehicle(String coordinates, float price, short speed, short year) {
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public float getPrice() {
        return price;
    }

    public short getSpeed() {
        return speed;
    }

    public short getYear() {
        return year;
    }
}
