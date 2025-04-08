package com.ivoyant.designpattern.decorator;

public class SugerDecorator extends CoffeeDecorator{
    public SugerDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double getCost(){
        return super.getCost() +1.0;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", sugar";
    }
}
