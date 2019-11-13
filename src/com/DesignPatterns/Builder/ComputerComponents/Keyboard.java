package com.DesignPatterns.Builder.ComputerComponents;

public class Keyboard {
    private String modelName;

    public Keyboard(String modelName) {
        this.modelName = modelName;
    }

    public String getKeyboardInformation(){
        return this.modelName;
    }
}
