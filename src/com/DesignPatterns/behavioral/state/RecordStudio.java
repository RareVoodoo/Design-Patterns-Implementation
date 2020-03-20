package com.DesignPatterns.behavioral.state;

public class RecordStudio {
    private RecordState state = new MusicState();

    public RecordState getState() {
        return state;
    }

    public void setState(RecordState state) {
        this.state = state;
    }

    public void previousState(){
        state.prev(this);
    }

    public void nextState(){
        state.next(this);
    }

    public void printStatus(){
        state.printStatus();
    }
}
