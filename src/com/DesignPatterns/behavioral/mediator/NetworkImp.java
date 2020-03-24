package com.DesignPatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class NetworkImp implements Network {
    private Point admin;
    private List<Point> points = new ArrayList<>();

    public void setAdmin(Point admin) {
        this.admin = admin;
    }

    public void addUserToNetwork(Point point){
        this.points.add(point);
    }

    @Override
    public void sendBroadbandSignal(String message, Point point) {
        for (Point u : points) {
            if (u != point) {
                u.getMessages(message);
            }
        }
        admin.getMessages(message);
    }
}
