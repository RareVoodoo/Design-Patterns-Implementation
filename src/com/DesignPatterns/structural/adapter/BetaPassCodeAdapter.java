package com.DesignPatterns.structural.adapter;

public class BetaPassCodeAdapter implements AlphaPassCode {
    public static final int PASS_CODE_IDENTIFIER_END_POSITION = 5;
    private BetaPassCode betaPassCode;

    public BetaPassCodeAdapter(BetaPassCode betaPassCode) {
        this.betaPassCode = betaPassCode;
    }

    private String generatedBetaPassCode= betaPassCode.generate();
    @Override
    public String generate() {
        return PASSCODE_IDENTIFIER + generatedBetaPassCode.substring(PASS_CODE_IDENTIFIER_END_POSITION,generatedBetaPassCode.length());
    }
}
