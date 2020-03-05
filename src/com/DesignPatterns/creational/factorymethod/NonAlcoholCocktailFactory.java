package com.DesignPatterns.creational.factorymethod;

import com.DesignPatterns.creational.factorymethod.drinktypes.NonAlcoholCocktail;

public class NonAlcoholCocktailFactory implements DrinkFactory{
    @Override
    public Drink createDrinkOrder() {
        return new NonAlcoholCocktail();
    }
}
