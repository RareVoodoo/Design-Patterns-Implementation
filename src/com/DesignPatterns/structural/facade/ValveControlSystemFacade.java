package com.DesignPatterns.structural.facade;

public class ValveControlSystemFacade {

    private WaterLevelSensor waterLevelSensor= new WaterLevelSensor(50);
    private WaterPressureSensor waterPressureSensor = new WaterPressureSensor(1.24);
    private WaterPump waterPump = new WaterPump();



    public void openValve(){
        waterLevelSensor.checkWaterLevel();
        waterPressureSensor.checkWaterPressure();
        waterPump.unlockPump();
    }

    public void closeValve(){
        waterLevelSensor.checkWaterLevel();
        waterPressureSensor.checkWaterPressure();
        waterPump.lockPump();
    }
}
