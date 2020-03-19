package com.DesignPatterns.structural.adapter;

public interface AlphaPassCode {
    String PASSCODE_IDENTIFIER = "ALPH@";
    int PASSCODE_BOUND = 500;
    String generate();

}
