package com.DesignPatterns.behavioral.visitor;

import java.util.UUID;

public class VisitorDemo {
    public static void main(String[] args) {
        Visitor visitor = new AccountVisitor();

        SessionStorage sessionStorage = new SessionStorage(generateSessionUuid());
        sessionStorage.addSession(new AdminAccount(generateSessionUuid()));
        sessionStorage.addSession(new UserAccount(generateSessionUuid()));

        sessionStorage.accept(visitor);
    }

    private static String generateSessionUuid() {
        return UUID.randomUUID().toString();
    }
}
