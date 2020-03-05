package com.DesignPatterns.creational.builder.ComputerComponents;

public class Graphics {
    private String modelName;

    public Graphics(String modelName) {
        this.modelName = modelName;
    }

    public String getGraphicsInformation(){
        return this.modelName;
    }
}
