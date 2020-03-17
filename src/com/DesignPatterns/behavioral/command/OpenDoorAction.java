package com.DesignPatterns.behavioral.command;

public class OpenDoorAction implements Action {
    private RemoteDoorLock doorLock;

    public OpenDoorAction(RemoteDoorLock doorLock) {
        this.doorLock = doorLock;
    }

    @Override
    public void executeAction() {
        doorLock.openDoor();
    }

}
