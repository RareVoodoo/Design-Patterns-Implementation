package com.DesignPatterns.behavioral.mediator;

public class NetworkAdminPoint implements Point {
    private Network network;
    private String name;

    public NetworkAdminPoint(Network network, String name) {
        this.network = network;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        network.sendBroadbandSignal(message, this);
    }

    @Override
    public void getMessages(String message) {
        System.out.println(this.name + " receiving message " + message);
    }
}
