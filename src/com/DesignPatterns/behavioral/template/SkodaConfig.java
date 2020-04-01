package com.DesignPatterns.behavioral.template;

public class SkodaConfig extends CarConfigurator {
    @Override
    public void chooseAdditionalOptions() {
        configureMultimedia();
        configureEngineAndGearbox();
    }

    private void configureMultimedia(){
        System.out.println("Multimedia configuration option");
    }

    private void configureEngineAndGearbox(){
        System.out.println("Engine and Gearbox configuration option");
    }
}
