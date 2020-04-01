package com.DesignPatterns.behavioral.strategy;

public class MediumNotification implements Notifier {
    @Override
    public void notifyByNotifier() {
        System.out.println("Medium severity notification");
    }
}
