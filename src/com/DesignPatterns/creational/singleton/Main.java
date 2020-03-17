package com.DesignPatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {

        Session currentSession = Session.getSession();
        Session anotherCurrentSession = Session.getSession();

        System.out.println(currentSession);
        System.out.println(anotherCurrentSession);

        currentSession.addSessionCall();
        System.out.println(anotherCurrentSession.getSessionCallCount());

        anotherCurrentSession.addSessionCall();
        System.out.println(currentSession.getSessionCallCount());

        System.out.println(currentSession.getSessionID());
        System.out.println(anotherCurrentSession.getSessionID());

    }
}
