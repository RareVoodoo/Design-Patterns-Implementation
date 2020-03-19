package com.DesignPatterns.structural.bridge;

public class AutomaticTransmission implements Gearbox {
    @Override
    public String setGearbox() {
            return "Type of Gearbox: Automatic transmission";
    }
}
