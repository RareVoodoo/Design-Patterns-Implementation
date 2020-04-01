package com.DesignPatterns.behavioral.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        NotifierExecutor notifierExecutor = new NotifierExecutor();

        notifierExecutor.setNotification(new ImportantNotification());
        notifierExecutor.execute();

        notifierExecutor.setNotification(new MediumNotification());
        notifierExecutor.execute();

        notifierExecutor.setNotification(new NonUrgentNotification());
        notifierExecutor.execute();
    }
}
