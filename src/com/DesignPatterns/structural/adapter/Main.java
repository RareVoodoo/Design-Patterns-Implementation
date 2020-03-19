package com.DesignPatterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        AlphaPassCodeGenerator alphaPassCodeGenerator = new AlphaPassCodeGenerator();
        alphaPassCodeGenerator.generatePassCode(new AlphaPassCodeImp());

        BetaPassCode betaPassCode = new BetaPassCodeImp();
        BetaPassCodeAdapter betaPassCodeAdapter = new BetaPassCodeAdapter(betaPassCode);
        alphaPassCodeGenerator.generatePassCode(betaPassCodeAdapter);

    }
}
