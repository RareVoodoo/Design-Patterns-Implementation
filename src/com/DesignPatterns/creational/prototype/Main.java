package com.DesignPatterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Book original = new Book("1984", "George Orwell", "Omgraph inc.",384);
        Book copy = (Book) original.copy();
        System.out.println(original);
        System.out.println(copy);



    }
}
