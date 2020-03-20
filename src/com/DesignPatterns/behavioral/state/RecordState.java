package com.DesignPatterns.behavioral.state;

public interface RecordState {
    void next(RecordStudio studio);
    void prev(RecordStudio studio);
    void printStatus();
}
