package com.yeqing.factorayer.domin;

public abstract class Pizza {

    private String description = "this is a pizz";

    public String getDescription(){
        return description;
    }
    public abstract void prepare();

    public abstract void bake();
    public abstract void  cut();
    public abstract void box();

}
