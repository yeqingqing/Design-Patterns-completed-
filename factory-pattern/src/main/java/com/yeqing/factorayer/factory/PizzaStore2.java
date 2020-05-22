package com.yeqing.factorayer.factory;

import com.yeqing.factorayer.domin.Pizza;

public abstract class PizzaStore2 {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.getDescription();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return  pizza;
    }

    public abstract Pizza createPizza(String type);
}
