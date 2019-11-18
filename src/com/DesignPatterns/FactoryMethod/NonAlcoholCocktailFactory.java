package com.DesignPatterns.FactoryMethod;

import com.DesignPatterns.FactoryMethod.drinktypes.NonAlcoholCocktail;

public class NonAlcoholCocktailFactory implements DrinkFactory{
    @Override
    public Drink createDrinkOrder() {
        return new NonAlcoholCocktail();
    }
}
