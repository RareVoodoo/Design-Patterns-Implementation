package com.DesignPatterns.Builder.ComputerComponents;

public class Memory {
    private String modelName;
    private int capacity;
    public Memory(String modelName , int capacity) {
        this.modelName = modelName;
        this.capacity = capacity;
    }

    public String getMemoryInformation(){
        return this.modelName + capacity + " GB";

    }
}
