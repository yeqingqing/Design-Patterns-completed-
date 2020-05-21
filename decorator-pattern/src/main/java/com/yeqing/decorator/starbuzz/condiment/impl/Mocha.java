package com.yeqing.decorator.starbuzz.condiment.impl;

import com.yeqing.decorator.starbuzz.beverage.Beverage;
import com.yeqing.decorator.starbuzz.condiment.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + " +Mocha ";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
