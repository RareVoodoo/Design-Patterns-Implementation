package com.DesignPatterns.structural.decorator;

public class Confetti extends CakeDecorator {

    public Confetti(Cake cake) {
        super(cake);
    }

    public String decorate(){
        return super.decorate() + decorateWithConfetti();
    }

    private String decorateWithConfetti(){
        return " with Confetti";
    }
}
