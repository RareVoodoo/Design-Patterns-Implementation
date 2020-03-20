package com.DesignPatterns.structural.facade;

public class WaterPressureSensor {
    private double currentBarrelPressure;

    public WaterPressureSensor(double currentBarrelPressure) {
        this.currentBarrelPressure = currentBarrelPressure;
    }

    private static final double  DEFAULT_BARREL_PRESSURE = 2.56;

    public void checkWaterPressure() {
        System.out.println("Current pressure is " + currentBarrelPressure);
        if (this.currentBarrelPressure <= DEFAULT_BARREL_PRESSURE) {
            System.out.println("Pressure level is low");
        } else {
            System.out.println("Pressure is OK");
        }
    }
}
