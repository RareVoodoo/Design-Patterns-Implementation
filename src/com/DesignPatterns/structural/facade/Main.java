package com.DesignPatterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        ValveControlSystemFacade valveControlSystem = new ValveControlSystemFacade();

        valveControlSystem.openValve();
        valveControlSystem.closeValve();
    }
}
