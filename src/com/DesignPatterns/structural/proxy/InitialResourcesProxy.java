package com.DesignPatterns.structural.proxy;

public class InitialResourcesProxy implements ResourceRenderer {
    private String url;
    private InitialResources initialResources;

    public InitialResourcesProxy(String url) {
        this.url = url;
    }

    @Override
    public void render() {
        if(initialResources == null){
            initialResources = new InitialResources(url);
        }
        initialResources.render();
    }
}
