package com.DesignPatterns.behavioral.chainofresponsibility;

public class Developer extends ActivityRegisterer {
    public Developer(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Developer fixing:" + message);
    }

}
