package com.DesignPatterns.structural.proxy;

public class InitialResources implements ResourceRenderer {
    private String url;

    public InitialResources(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Loading initial Resources from "+ url);
    }
    @Override
    public void render() {
        System.out.println("Rendering resources from link: " + url );
    }
}
