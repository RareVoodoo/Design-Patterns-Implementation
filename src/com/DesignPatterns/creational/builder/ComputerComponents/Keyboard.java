package com.DesignPatterns.creational.builder.ComputerComponents;

public class Keyboard {
    private String modelName;

    public Keyboard(String modelName) {
        this.modelName = modelName;
    }

    public String getKeyboardInformation(){
        return this.modelName;
    }
}
