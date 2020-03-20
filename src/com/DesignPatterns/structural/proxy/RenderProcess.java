package com.DesignPatterns.structural.proxy;

public class RenderProcess {
    public static final String DEFAULT_RESOURCES_URL = "https:/project/initialResources";
    public static void main(String[] args) {

        ResourceRenderer resourceRenderer = new InitialResourcesProxy(DEFAULT_RESOURCES_URL);
        resourceRenderer.render();
    }
}
