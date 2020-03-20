package com.DesignPatterns.structural.facade;

public class WaterLevelSensor {
    private int currentWaterLevel;

    public WaterLevelSensor(int currentWaterLevel) {
        this.currentWaterLevel = currentWaterLevel;
    }

    private static final int  DEFAULT_BARREL_WATER_CAPACITY = 100;

    public void checkWaterLevel(){
        System.out.println("Current water level is "+ currentWaterLevel);
        if (this.currentWaterLevel <= DEFAULT_BARREL_WATER_CAPACITY){
            System.out.println("Barrel water level is low");
        }else {
            System.out.println("Water level is OK");
        }
    }
}
