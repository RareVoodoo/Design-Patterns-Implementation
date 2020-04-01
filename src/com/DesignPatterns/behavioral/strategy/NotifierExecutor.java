package com.DesignPatterns.behavioral.strategy;

public class NotifierExecutor {
    private Notifier notifier;

    public void setNotification(Notifier notifier) {
        this.notifier = notifier;
    }

    public void execute(){
        notifier.notifyByNotifier();
    }
}
