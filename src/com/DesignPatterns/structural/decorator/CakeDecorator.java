package com.DesignPatterns.structural.decorator;

public abstract class CakeDecorator implements Cake {
    private Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String decorate() {
        return cake.decorate();
    }


}
