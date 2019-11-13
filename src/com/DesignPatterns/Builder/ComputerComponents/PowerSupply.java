package com.DesignPatterns.Builder.ComputerComponents;

public class PowerSupply {
    private String model;
    private int wattage;

    public PowerSupply(String model, int wattage){
        this.model = model;
        this.wattage = wattage;
    }

    public String getPsInformation(){
        return this.model + ", " +  this.wattage + "W";
    }
}
