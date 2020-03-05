package com.DesignPatterns.creational.factorymethod;

import com.DesignPatterns.creational.factorymethod.drinktypes.AlcoholCocktail;

public class AlcoholCocktailFactory implements DrinkFactory{
    @Override
    public Drink createDrinkOrder() {
        return new AlcoholCocktail();
    }
}
