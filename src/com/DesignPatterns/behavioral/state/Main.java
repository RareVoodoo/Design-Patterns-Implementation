package com.DesignPatterns.behavioral.state;

public class Main {
    public static void main(String[] args) {
        RecordStudio studio = new RecordStudio();
        studio.printStatus();

        studio.nextState();
        studio.printStatus();


        studio.nextState();
        studio.printStatus();


        studio.nextState();
        studio.printStatus();

    }
}
