package com.DesignPatterns.behavioral.visitor;

public class AccountVisitor implements Visitor {
    @Override
    public void login(AdminAccount adminAccount) {
        System.out.println("Admin logged in with session uuid "+ adminAccount.sessionUuid);
    }

    @Override
    public void login(UserAccount userAccount) {
        System.out.println("User logged in with session uuid " + userAccount.sessionUuid);
    }
}
