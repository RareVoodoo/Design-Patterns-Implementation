package com.DesignPatterns.Builder.ComputerComponents;

public class Monitor {
    private String modelName;
    private DisplayType displayType;

    public Monitor(String modelName, DisplayType displayType) {
        this.modelName = modelName;
        this.displayType = displayType;
    }

    public String getMonitorInformation(){
        return this.modelName + ", " +  this.displayType;
    }
}
