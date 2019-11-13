package com.DesignPatterns.Builder.ComputerComponents;

public class Usb {
    private String model;
    private int count;

    public Usb(String model, int count) {
        this.model = model;
        this.count = count;
    }

    public String getUsbInformation(){
        return this.model + ", " +  this.count + "x";
    }
}
