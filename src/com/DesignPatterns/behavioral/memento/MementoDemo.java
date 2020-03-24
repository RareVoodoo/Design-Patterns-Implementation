package com.DesignPatterns.behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {
        TextFile textFile = new TextFile();
        FileState fileState = new FileState();


        textFile.setTextAndDate("New text 1");
        fileState.setSave(textFile.save());

        System.out.println(textFile);

        textFile.setTextAndDate("New text 2");

        System.out.println(textFile);

        textFile.undo(fileState.getSave());

        System.out.println(textFile);

    }
}
