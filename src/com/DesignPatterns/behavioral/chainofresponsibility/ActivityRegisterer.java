package com.DesignPatterns.behavioral.chainofresponsibility;

public abstract class ActivityRegisterer {
  private int priority;
  private ActivityRegisterer nextActivityRegisterer;

    public ActivityRegisterer(int priority) {
        this.priority = priority;
    }

    public void setNextActivityRegisterer(ActivityRegisterer nextActivityRegisterer) {
        this.nextActivityRegisterer = nextActivityRegisterer;
    }

    void notifyDeveloper(String message, int level){
        if(level >= priority){
            write(message);
        }

        if(nextActivityRegisterer !=null){
            nextActivityRegisterer.notifyDeveloper(message, level);
        }
    }

    public abstract void write(String message);
}
