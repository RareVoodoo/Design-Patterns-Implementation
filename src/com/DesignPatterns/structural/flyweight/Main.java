package com.DesignPatterns.structural.flyweight;

public class Main {
    private static final String colors[] = {"Red","Green","Blue","White","Black"};
    public static final int CREATED_SHAPES_NUMBER = 10;
    public static void main(String[] args) {
        for (int i = 0; i < CREATED_SHAPES_NUMBER; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomCoordinate());
            circle.setY(getRandomCoordinate());
            circle.draw();
        }
    }

    private static String getRandomColor(){
        return colors[(int) (Math.random() * colors.length)];
    }


    private static int getRandomCoordinate(){
        return (int)(Math.random() *100);
    }
}
