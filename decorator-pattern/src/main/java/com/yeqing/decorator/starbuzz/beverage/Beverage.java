package com.yeqing.decorator.starbuzz.beverage;

/**
 * 饮料
 */
public abstract class Beverage {
    public String description = "Unknown Beverage";

    public String getDescription(){
        return  description;
    }

    public abstract  double cost();
}
