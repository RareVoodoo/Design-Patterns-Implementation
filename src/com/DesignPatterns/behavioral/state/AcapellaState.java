package com.DesignPatterns.behavioral.state;

public class AcapellaState implements RecordState {

    @Override
    public void next(RecordStudio studio) {
        System.out.println("Your 'banger' is already recorded. Wait for concert");
    }

    @Override
    public void prev(RecordStudio studio) {
        System.out.println();
    }

    @Override
    public void printStatus() {
        System.out.println("Recording is finished");
    }
}
