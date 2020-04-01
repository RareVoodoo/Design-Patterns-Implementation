package com.DesignPatterns.behavioral.visitor;

public abstract class AccountElement {
    public String sessionUuid;

    public AccountElement(String sessionUuid){
        this.sessionUuid = sessionUuid;
    }

    public abstract void accept(Visitor v);
}
