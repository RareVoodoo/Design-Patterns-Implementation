package com.DesignPatterns.FactoryMethod.drinktypes;

import com.DesignPatterns.FactoryMethod.Drink;

public class NonAlcoholCocktail implements Drink {

    @Override
    public void executeOrder() {
        System.out.println("Your non alcohol cocktail is ready");
    }
}
