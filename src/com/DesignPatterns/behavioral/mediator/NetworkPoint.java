package com.DesignPatterns.behavioral.mediator;

public class NetworkPoint implements Point {
    private Network network;
    private String name;

    public NetworkPoint(Network network, String name) {
        this.network = network;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        network.sendBroadbandSignal(message,this);
    }

    @Override
    public void getMessages(String message) {
        System.out.println(this.name + "receiving message " + message);
    }
}
