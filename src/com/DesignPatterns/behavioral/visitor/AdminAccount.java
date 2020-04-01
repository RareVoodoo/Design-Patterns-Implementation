package com.DesignPatterns.behavioral.visitor;

public class AdminAccount extends AccountElement {
    public AdminAccount(String sessionUuid) {
        super(sessionUuid);
    }

    @Override
    public void accept(Visitor v) {
        v.login(this);
    }
}
