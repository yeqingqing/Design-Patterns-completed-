package com.yeqing.decorator.starbuzz.condiment;

import com.yeqing.decorator.starbuzz.beverage.Beverage;

/**
 * 调料
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * 首先，必须让Condiment Decorator能 够取代Beverage，
     * 所以将Condiment Decorator扩展自 Beverage 类。
     * @return
     */
    @Override
    public abstract String getDescription();

    /**
     * 所有的调料装饰者都必须重新实现
     * getDescription()方法。
     */
}
