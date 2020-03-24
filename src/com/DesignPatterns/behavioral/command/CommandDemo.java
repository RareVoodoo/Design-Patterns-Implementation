package com.DesignPatterns.behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {
        RemoteDoorLock remoteDoorLock = new RemoteDoorLock();
        User user = new User(new OpenDoorAction(remoteDoorLock),
                             new CloseDoorAction(remoteDoorLock),
                             new ResetSecretCodeAction(remoteDoorLock));
        user.openDoor();
        user.closeDoor();
        user.resetSecretCode();
    }
}
