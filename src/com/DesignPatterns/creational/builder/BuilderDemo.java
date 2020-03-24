package com.DesignPatterns.creational.builder;


import com.DesignPatterns.creational.builder.ComputerComponents.DisplayType;

public class BuilderDemo {
    public static void main(String[] args) {
        Computer laptop = (new ComputerBuilder("laptop"))
                .addProcessor("Intel Core i7 7700T","4.4 HHZ")
                .addGraphics("Nvidia RTX 2060")
                .addMotherboard("FXA84HF-J3")
                .addMemory("Kingston",16)
                .addKeyboard("SteelSeries")
                .addDisplay(DisplayType.OLED)
                .build();

        laptop.getComputerCharacteristics();
    }




}
