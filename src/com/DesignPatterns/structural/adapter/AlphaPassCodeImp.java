package com.DesignPatterns.structural.adapter;

import java.util.Random;

public class AlphaPassCodeImp implements AlphaPassCode {
    private String passCode;
    private Random random;
    @Override
    public String generate() {
        return PASSCODE_IDENTIFIER + random.nextInt(PASSCODE_BOUND);
    }
}
