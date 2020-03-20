package com.DesignPatterns.behavioral.state;

public class MusicState implements RecordState {


    @Override
    public void next(RecordStudio studio) {
        studio.setState(new AcapellaState());
    }

    @Override
    public void prev(RecordStudio studio) {
        System.out.println("This is initial music creation state");
    }

    @Override
    public void printStatus() {
        System.out.println("Music is recorded");
    }
}
