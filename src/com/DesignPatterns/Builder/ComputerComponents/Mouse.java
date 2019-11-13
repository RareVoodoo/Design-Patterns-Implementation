package com.DesignPatterns.Builder.ComputerComponents;

public class Mouse {
    private String modelName;

    public Mouse(String modelName) {
        this.modelName = modelName;
    }

    public String getMouseInformation(){
        return this.modelName;
    }
}
