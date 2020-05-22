package com.yeqing.factorayer.factory;

import com.yeqing.factorayer.domin.Pizza;

public class PizzStore {
    SimplePizzFactory simplePizzFactory;


    public PizzStore(SimplePizzFactory factory){
        this.simplePizzFactory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = simplePizzFactory.createPizza(type);
        pizza.getDescription();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return  pizza;
    }
}
