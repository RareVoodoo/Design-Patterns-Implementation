package com.DesignPatterns.behavioral.visitor;

public class UserAccount extends AccountElement {
    public UserAccount(String sessionUuid) {
        super(sessionUuid);
    }

    @Override
    public void accept(Visitor v) {
        v.login(this);
    }
}
