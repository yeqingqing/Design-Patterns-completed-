package com.yeqing.decorator.starbuzz;

import com.yeqing.decorator.starbuzz.beverage.Beverage;
import com.yeqing.decorator.starbuzz.condiment.impl.Mocha;
import com.yeqing.decorator.starbuzz.cup.impl.BigCup;
import com.yeqing.decorator.starbuzz.drink.Espresso;
import com.yeqing.decorator.starbuzz.drink.HouseBlend;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "   $" + beverage.cost());

        Beverage beverage2 =new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new BigCup(beverage2);
        System.out.println(beverage2.getDescription() + "   $" + beverage2.cost());
    }
}
