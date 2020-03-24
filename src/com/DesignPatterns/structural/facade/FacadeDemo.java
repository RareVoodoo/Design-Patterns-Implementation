package com.DesignPatterns.structural.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        ValveControlSystemFacade valveControlSystem = new ValveControlSystemFacade();

        valveControlSystem.openValve();
        valveControlSystem.closeValve();
    }
}
