package com.DesignPatterns.behavioral.template;

public class RollsRoyceConfig extends CarConfigurator {

    @Override
    public void chooseAdditionalOptions() {
        configureEngineAndGearbox();
        configureFootMats();
        configureMultimedia();
        configureViewingSuiteSeats();
        configureVinPlate();

    }

    private void configureMultimedia(){
        System.out.println("Multimedia configuration option");
    }

    private void configureEngineAndGearbox(){
        System.out.println("Engine and Gearbox configuration option");
    }

    private void configureViewingSuiteSeats(){
        System.out.println("Viewing Suite Seats configuration option");
    }

    private void configureVinPlate(){
        System.out.println("VIN Plate configuration option");
    }

    private void configureFootMats(){
        System.out.println("Foot mats configuration option");
    }

}
