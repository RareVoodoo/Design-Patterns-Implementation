package com.DesignPatterns.behavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        NetworkImp chat = new NetworkImp();

        Point admin = new NetworkAdminPoint(chat,"Admin Point");
        Point point1 = new NetworkPoint(chat,"Point 1 ");
        Point point2 = new NetworkPoint(chat,"Point 2 ");

        chat.setAdmin(admin);
        chat.addUserToNetwork(point1);
        chat.addUserToNetwork(point2);

        point1.sendMessage("Searching for concrete point...");
    }
}
