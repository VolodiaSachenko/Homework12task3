package com.homework;

public class Ship extends Vehicle {
    private final short passengers;
    private final String portSubscripts;

    public Ship(short passengers, String portSubscripts) {
        super("50°27.282′N, 30°31.428′E", 1250000.50f, (short) 45, (short) 2015);
        this.passengers = passengers;
        this.portSubscripts = portSubscripts;
    }

    public short getPassengers() {
        return passengers;
    }

    public String getPortSubscripts() {
        return portSubscripts;
    }

    static void showInfo(Ship vehicle) {
        System.out.println("Корабель \uD83D\uDEA2");
        System.out.println("Координати: " + vehicle.getCoordinates());
        System.out.println("Ціна: " + vehicle.getPrice() + "$");
        System.out.println("Швидкість: " + vehicle.getSpeed() + "км/год");
        System.out.println("Рік випуску: " + vehicle.getYear());
        System.out.println("Кількість пасажирів: " + vehicle.getPassengers());
        System.out.println("Порт приписки: " + vehicle.getPortSubscripts());
        System.out.println("---------------");
    }
}
