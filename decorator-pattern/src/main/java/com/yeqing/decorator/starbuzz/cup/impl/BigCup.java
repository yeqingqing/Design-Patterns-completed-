package com.yeqing.decorator.starbuzz.cup.impl;

import com.yeqing.decorator.starbuzz.beverage.Beverage;
import com.yeqing.decorator.starbuzz.cup.Cup;

public class BigCup extends Cup {

    private Beverage beverage;

    public BigCup(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return  beverage.getDescription() + "  +BigCup  ";
    }
@Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
