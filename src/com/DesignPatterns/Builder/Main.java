package com.DesignPatterns.Builder;


import com.DesignPatterns.Builder.ComputerComponents.DisplayType;

public class Main {
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
