package com.DesignPatterns.behavioral.chainofresponsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        ActivityRegisterer juniorDeveloper = new JuniorDeveloper(Priority.ROUTINE);
        ActivityRegisterer developer = new Developer(Priority.IMPORTANT);
        ActivityRegisterer teamLead = new TeamLead(Priority.ASAP);

        juniorDeveloper.setNextActivityRegisterer(developer);
        developer.setNextActivityRegisterer(teamLead);

        juniorDeveloper.notifyDeveloper("Fix configuration files",Priority.ROUTINE);
        juniorDeveloper.notifyDeveloper("Fix major bug", Priority.IMPORTANT);
        juniorDeveloper.notifyDeveloper("Fix global project issue", Priority.ASAP);
    }
}
