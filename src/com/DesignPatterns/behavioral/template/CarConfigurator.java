package com.DesignPatterns.behavioral.template;

public abstract class CarConfigurator {
    public void configureAuto(){
        chooseCarModel();
        chooseAdditionalOptions();
        submitBuyersConfiguration();
    }

    public abstract void chooseAdditionalOptions();

    private void chooseCarModel(){
        System.out.println("Model selection process");
    }

    private void submitBuyersConfiguration(){
        System.out.println("Submitting car configuration ");
    }
    
    
}
