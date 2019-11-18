package com.DesignPatterns.FactoryMethod;

import com.DesignPatterns.FactoryMethod.bartendermenulists.AlcoholDrinkList;
import com.DesignPatterns.FactoryMethod.bartendermenulists.NonAlcoholDrinkList;

public class Main {

    public static void main(String[] args) throws Exception {
        DrinkFactory drinkFactory =  createSpecialDrink(AlcoholDrinkList.B52);;
        Drink drink = drinkFactory.createDrinkOrder();

        drink.executeOrder();

    }

     static DrinkFactory createSpecialDrink(Enum cocktail) throws Exception {
        if (cocktail instanceof AlcoholDrinkList){
            return new AlcoholCocktailFactory();
        }
        else if (cocktail instanceof NonAlcoholDrinkList)
        {
            return new NonAlcoholCocktailFactory();
        }
        else{
            throw  new Exception(" There is no " + cocktail + " on the bartender's menu");
        }
    }
}
