package com.DesignPatterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {
    private String username;

    public Subscriber(String username) {
        this.username = username;
    }

    @Override
    public void handleEvent(List<String> videos, String channelName) {
        System.out.println("Hi " + username + ", " + channelName + " update his/her channel!!! Look video list: \n" + videos +
                "\n=============================");
    }


}
