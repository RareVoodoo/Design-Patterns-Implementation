package com.DesignPatterns.creational.builder;


import com.DesignPatterns.creational.builder.ComputerComponents.DisplayType;

public class Computer {
    private String computerName;

    private String processor;
    private String  graphics;
    private String  memory;
    private String motherboard;
    private String powerSupply;
    private String  keyboard;
    private String mouse;
    private String  usb;
    private DisplayType display;


    public Computer(ComputerBuilder computerBuilder, String computerName){
        this.computerName = computerBuilder.computerName;
        this.processor =  computerBuilder.processor;
        this.graphics =  computerBuilder.graphics;
        this.memory =  computerBuilder.memory;
        this.motherboard =  computerBuilder.motherboard;
        this.keyboard =  computerBuilder.keyboard;
        this.powerSupply =  computerBuilder.powerSupply;
        this.mouse = computerBuilder.mouse;
        this.usb = computerBuilder.usb;
        this.display = computerBuilder.display;
    }


    public void getComputerCharacteristics() {
        System.out.println( "Computer{" +
                "computerName='" + computerName + '\n' +
                "display='" + display + '\n' +
                " processor='" + processor + '\n' +
                " graphics='" + graphics + '\n' +
                " memory='" + memory + '\n' +
                " motherboard='" + motherboard + '\n' +
                " powerSupply='" + powerSupply + '\n' +
                " keyboard='" + keyboard + '\n' +
                " mouse='" + mouse + '\n' +
                " usb='" + usb + '\n' +
                '}');
    }
}
