package com.DesignPatterns.creational.singleton;

import java.util.Random;

public class Session {
    private Random random = new Random();
    private int sessionID = random.nextInt(100);
    private int sessionCallCount =0;
    private static Session currentSession;

    private Session() { }

    public void addSessionCall(){
        sessionCallCount++;
    }

    public static synchronized Session getSession(){
        if (currentSession == null){
            currentSession = new Session();
        }
        return currentSession;
    }

    public String getSessionCallCount() {
        return "Current session call count is : " +  this.sessionCallCount;
    }

    public String getSessionID() {
        return "Current session ID :" +  this.sessionID;
    }
}
