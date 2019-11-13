package com.DesignPatterns.Builder.ComputerComponents;

public class Processor {
    private String model;
    private String coreFrequency;

    public Processor(String model, String coreFrequency) {
        this.model = model;
        this.coreFrequency = coreFrequency;
    }



    public  String getProcessorInformation(){
        return this.model + this.coreFrequency;
    }



}
