package com.DesignPatterns.structural.decorator;

public class Main {

    public static void main(String[] args) {
    Cake cake = new SweetCream(
            new Candy(new Confetti( new SweetCream( new CakeImp()))));
        System.out.println(cake.decorate());
    }
}
