package com.ivoyant.designpattern.decorator;

public class Espresso implements Coffee{

    @Override
    public double getCost() {
        return 8.0;
    }

    @Override
    public String getDescription() {
        return "Espresso coffee";
    }
}
