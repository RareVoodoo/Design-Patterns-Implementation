package com.DesignPatterns.structural.facade;

public class WaterPump {
    private boolean isLocked = true;

    public void unlockPump(){
        isLocked = false;
        System.out.println("Pump is unlocked");
    }


    public void lockPump(){
        isLocked = true;
        System.out.println("Pump is locked");
    }

}
