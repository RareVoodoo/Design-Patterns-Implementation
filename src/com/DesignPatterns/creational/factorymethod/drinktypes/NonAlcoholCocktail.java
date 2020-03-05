package com.DesignPatterns.creational.factorymethod.drinktypes;

import com.DesignPatterns.creational.factorymethod.Drink;

public class NonAlcoholCocktail implements Drink {

    @Override
    public void executeOrder() {
        System.out.println("Your non alcohol cocktail is ready");
    }
}
