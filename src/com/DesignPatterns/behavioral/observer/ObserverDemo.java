package com.DesignPatterns.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Channel userChannel = new Channel("TestChannel");

        userChannel.addNewVideo("Video 1");
        userChannel.addNewVideo("Video 2");

        Observer firstSubscriber = new Subscriber("JohnDoe");
        Observer secondSubscriber = new Subscriber("BuzzyAzz");

        userChannel.addObserver(firstSubscriber);
        userChannel.addObserver(secondSubscriber);

        userChannel.addNewVideo("New Video 3");
    }
}
