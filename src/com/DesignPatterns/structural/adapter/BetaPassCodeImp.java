package com.DesignPatterns.structural.adapter;

import java.util.Random;

public class BetaPassCodeImp implements BetaPassCode {
    private String passCode;
    private Random random;
    @Override
    public String generate() {
        return PASSCODE_IDENTIFIER + random.nextInt(PASSCODE_BOUND);
    }
}
