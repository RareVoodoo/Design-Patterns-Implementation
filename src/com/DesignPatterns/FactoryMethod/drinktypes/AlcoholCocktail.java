package com.DesignPatterns.FactoryMethod.drinktypes;

import com.DesignPatterns.FactoryMethod.Drink;

public class AlcoholCocktail implements Drink {
    @Override
    public void executeOrder() {
        System.out.println("Your alcohol cocktail is ready");
    }
}
