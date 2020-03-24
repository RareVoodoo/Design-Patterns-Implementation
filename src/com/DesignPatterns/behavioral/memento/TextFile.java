package com.DesignPatterns.behavioral.memento;

import java.util.Date;

public class TextFile {
    private String text;
    private Date date;

    public void setTextAndDate(String text){
        this.text = text;
        this.date = new Date();
    }

    public Saver save() {
        return new Saver(text);
    }

    public void undo(Saver saver){
        text = saver.getText();
        date = saver.getDate();
    }


    @Override
    public String toString() {
        return "TextFile{" +
                "\ntext='" + text  +
                ", \ndate=" + date +
                '}';
    }
}
