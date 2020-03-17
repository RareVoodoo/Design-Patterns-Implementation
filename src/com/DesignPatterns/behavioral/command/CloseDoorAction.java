package com.DesignPatterns.behavioral.command;

public class CloseDoorAction implements Action {
    RemoteDoorLock doorLock;

    public CloseDoorAction(RemoteDoorLock doorLock) {
        this.doorLock = doorLock;
    }

    @Override
    public void executeAction() {
        doorLock.closeDoor();
    }

}

