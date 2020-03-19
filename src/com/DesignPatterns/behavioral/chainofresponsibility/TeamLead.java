package com.DesignPatterns.behavioral.chainofresponsibility;

public class TeamLead extends ActivityRegisterer {

    public TeamLead(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Team lead fixing: "+ message);
    }
}
