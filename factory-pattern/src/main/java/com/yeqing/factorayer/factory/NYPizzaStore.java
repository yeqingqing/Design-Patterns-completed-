package com.yeqing.factorayer.factory;

import com.yeqing.factorayer.domin.NYStyleCheesePizza;
import com.yeqing.factorayer.domin.Pizza;

public class NYPizzaStore extends  PizzaStore2 {

    @Override
    public Pizza createPizza(String item) {
        if(item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        return  null;
    }
}
