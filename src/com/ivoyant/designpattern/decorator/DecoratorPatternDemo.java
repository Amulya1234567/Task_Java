package com.ivoyant.designpattern.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Coffee coffee=new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $ " +coffee.getCost());

        coffee=new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $ " +coffee.getCost());

        coffee=new SugerDecorator(coffee);
        System.out.println(coffee.getDescription() + " $ " + coffee.getCost());
    }
}
