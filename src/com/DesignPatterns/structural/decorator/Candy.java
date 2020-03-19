package com.DesignPatterns.structural.decorator;

public class Candy extends CakeDecorator {

    public Candy(Cake cake) {
        super(cake);
    }

    public String decorate(){
        return super.decorate() + decorateWithCandies();
    }

    private String decorateWithCandies(){
        return " with Candies";
    }
}
