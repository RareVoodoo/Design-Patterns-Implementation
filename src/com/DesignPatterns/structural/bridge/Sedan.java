package com.DesignPatterns.structural.bridge;

public class Sedan extends Car {
    public Sedan(Gearbox gearbox) {
        super(gearbox);
    }

    @Override
    public String configureGearbox() {
        return "Configuring sedan:" + gearbox.setGearbox();
    }
}
