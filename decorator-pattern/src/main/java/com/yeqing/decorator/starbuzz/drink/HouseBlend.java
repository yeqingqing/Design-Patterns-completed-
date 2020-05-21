package com.yeqing.decorator.starbuzz.drink;

import com.yeqing.decorator.starbuzz.beverage.Beverage;

/**
 * 黑咖啡
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = " House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
