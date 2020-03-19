package com.DesignPatterns.structural.bridge;

public class ManualTransmission implements Gearbox {
    @Override
    public String setGearbox() {
        return "Type of Gearbox: Manual transmission";
    }
}
