package com.DesignPatterns.behavioral.visitor;

public interface Visitor {
    void login(AdminAccount adminAccount);

    void login(UserAccount userAccount);
}
