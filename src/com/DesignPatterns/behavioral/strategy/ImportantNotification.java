package com.DesignPatterns.behavioral.strategy;

public class ImportantNotification implements Notifier {
    @Override
    public void notifyByNotifier() {
        System.out.println("Important notification");
    }
}
