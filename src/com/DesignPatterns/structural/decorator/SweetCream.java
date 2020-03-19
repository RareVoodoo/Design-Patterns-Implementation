package com.DesignPatterns.structural.decorator;

public class SweetCream extends CakeDecorator {

    public SweetCream(Cake cake) {
        super(cake);
    }

    public String decorate(){
        return super.decorate() + decorateWithSweetCream();
    }

    private String decorateWithSweetCream(){
        return " with Sweet Cream";
    }
}
