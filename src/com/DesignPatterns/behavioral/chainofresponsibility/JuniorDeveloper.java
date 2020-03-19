package com.DesignPatterns.behavioral.chainofresponsibility;

public class JuniorDeveloper extends ActivityRegisterer {

    public JuniorDeveloper(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Junior developer fixing: " + message);
    }
}
