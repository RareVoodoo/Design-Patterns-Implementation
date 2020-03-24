package com.DesignPatterns.behavioral.observer;

import java.util.ArrayList;

public class Channel implements Observed {
    private String channelName;

    private ArrayList<String> videos = new ArrayList<>();
    private ArrayList<Observer> subscribers = new ArrayList<>();

    public Channel(String channelName) {
        this.channelName = channelName;
    }

    public void addNewVideo(String video){
        videos.add(video);
        notifyObservers();
    }

    public void removeVideo(String video){
        videos.remove(video);
        notifyObservers();
    }


    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(this.videos,this.channelName);
        }
    }
}
