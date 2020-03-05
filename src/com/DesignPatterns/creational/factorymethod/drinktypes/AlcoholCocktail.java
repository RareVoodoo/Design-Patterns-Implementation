package com.DesignPatterns.creational.factorymethod.drinktypes;

import com.DesignPatterns.creational.factorymethod.Drink;

public class AlcoholCocktail implements Drink {
    @Override
    public void executeOrder() {
        System.out.println("Your alcohol cocktail is ready");
    }
}
