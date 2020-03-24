package com.DesignPatterns.behavioral.memento;

import java.util.Date;

public class Saver {
    private final String text;
    private final Date date;

    public Saver(String text) {
        this.text = text;
        this.date = new Date();
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }
}
