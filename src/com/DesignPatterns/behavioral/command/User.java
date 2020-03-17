package com.DesignPatterns.behavioral.command;

public class User {
    private Action open;
    private Action close;
    private Action resetCode;

    public User(Action open, Action close, Action resetCode) {
        this.open = open;
        this.close = close;
        this.resetCode = resetCode;
    }

    public void openDoor(){
        open.executeAction();
    }

    public void closeDoor(){
        close.executeAction();
    }

    public void resetSecretCode(){
        resetCode.executeAction();
    }
}
