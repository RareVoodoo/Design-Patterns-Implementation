package com.DesignPatterns.structural.bridge;

public class CarConfigurer {
    public static void main(String[] args) {
        Car sedan = new Sedan(new AutomaticTransmission());
        Car jeep = new Jeep(new ManualTransmission());

        System.out.println(sedan.configureGearbox());
        System.out.println(jeep.configureGearbox());
    }
}
