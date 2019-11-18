package com.DesignPatterns.FactoryMethod;

import com.DesignPatterns.FactoryMethod.drinktypes.AlcoholCocktail;

public class AlcoholCocktailFactory implements DrinkFactory{
    @Override
    public Drink createDrinkOrder() {
        return new AlcoholCocktail();
    }
}
