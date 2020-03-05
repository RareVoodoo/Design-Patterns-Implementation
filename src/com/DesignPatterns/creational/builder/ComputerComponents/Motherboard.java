package com.DesignPatterns.creational.builder.ComputerComponents;

public class Motherboard {
    private String modelName;

    public Motherboard(String modelName) {
        this.modelName = modelName;
    }

    public String getMotherboardInformation(){
        return this.modelName;
    }
}
