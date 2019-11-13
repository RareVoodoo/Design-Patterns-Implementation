package com.DesignPatterns.Builder;

import com.DesignPatterns.Builder.ComputerComponents.*;


public class ComputerBuilder {

    public String computerName;


    String processor = "not installed";
    String graphics = "not installed";
    String memory = "not installed";
    String motherboard = "not installed";
    String powerSupply = "external";
    String keyboard = "not included";
    String mouse = "not included";
    String usb = " not installed";
    DisplayType display = DisplayType.EMPTY;


    public ComputerBuilder(String computerName) {
        this.computerName = computerName;
    }

    public ComputerBuilder addProcessor(String model, String coreFrequency) {
        this.processor = new Processor(model, coreFrequency).getProcessorInformation();
        return this;
    }

    public ComputerBuilder addGraphics(String model) {
        this.graphics = new Graphics(model).getGraphicsInformation();
        return this;
    }

    public ComputerBuilder addMemory(String model, int capacity) {
        this.memory = new Memory(model, capacity).getMemoryInformation();
        return this;
    }

    public ComputerBuilder addMotherboard(String model) {
        this.motherboard = new Motherboard(model).getMotherboardInformation();
        return this;
    }

    public ComputerBuilder addPowerSupply(String model, int wattage) {
        this.powerSupply = new PowerSupply(model, wattage).getPsInformation();
        return this;
    }

    public ComputerBuilder addDisplay(DisplayType display) {
        this.display = display;
        return this;
    }

    public ComputerBuilder addKeyboard(String model) {
        this.keyboard = new Keyboard(model).getKeyboardInformation();
        return this;
    }

    public ComputerBuilder addMouse(String model) {
        this.mouse = new Mouse(model).getMouseInformation();
        return this;
    }

    public ComputerBuilder addUsb(String model, int count) {
        this.usb = new Usb(model, count).getUsbInformation();
        return this;
    }

     Computer build() {
        return new Computer(this, computerName);
    }


}
