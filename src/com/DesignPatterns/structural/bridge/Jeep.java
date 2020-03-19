package com.DesignPatterns.structural.bridge;

public class Jeep extends Car {
    public Jeep(Gearbox gearbox) {
        super(gearbox);
    }

    @Override
    public String configureGearbox() {
        return "Configuring jeep:" + gearbox.setGearbox();
    }
}
