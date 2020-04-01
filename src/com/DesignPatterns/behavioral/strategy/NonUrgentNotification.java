package com.DesignPatterns.behavioral.strategy;

public class NonUrgentNotification implements Notifier {
    @Override
    public void notifyByNotifier() {
        System.out.println("Non urgent notification");
    }
}
