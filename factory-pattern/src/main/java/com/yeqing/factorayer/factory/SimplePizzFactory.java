package com.yeqing.factorayer.factory;

import com.yeqing.factorayer.domin.CheesePizza;
import com.yeqing.factorayer.domin.Pizza;

public class SimplePizzFactory {
    public Pizza createPizza(String type){
        Pizza pizz = null;

        if(type.equals("cheese")){
            pizz = new CheesePizza();
        }else if(type.equals("pepperoni")){

        }
        return  pizz;
    }
}
