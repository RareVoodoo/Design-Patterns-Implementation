package com.DesignPatterns.behavioral.command;

public class ResetSecretCodeAction implements Action {
    private RemoteDoorLock doorLock;

    public ResetSecretCodeAction(RemoteDoorLock doorLock) {
        this.doorLock = doorLock;
    }

    @Override
    public void executeAction() {
        doorLock.resetSecretCode();
    }
}
