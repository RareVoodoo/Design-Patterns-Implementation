package com.DesignPatterns.behavioral.template;

public class TemplateDemo {
    public static void main(String[] args) {
        SkodaConfig skodaConfig = new SkodaConfig();
        RollsRoyceConfig rollsRoyceConfig = new RollsRoyceConfig();

        skodaConfig.configureAuto();
        System.out.println("===================");
        rollsRoyceConfig.configureAuto();
    }
}
