package com.DesignPatterns.structural.adapter;

public interface BetaPassCode {
    String PASSCODE_IDENTIFIER = "BET@";
    int PASSCODE_BOUND = 800;
    String generate();
}
