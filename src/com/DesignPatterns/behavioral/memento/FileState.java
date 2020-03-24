package com.DesignPatterns.behavioral.memento;

public class FileState {
    private Saver save;

    public Saver getSave() {
        return save;
    }

    public void setSave(Saver save) {
        this.save = save;
    }
}
