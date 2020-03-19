package com.DesignPatterns.structural.bridge;

public abstract class Car {
    protected Gearbox gearbox;

    public Car(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public abstract String configureGearbox();
}
