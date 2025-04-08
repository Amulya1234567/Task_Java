package com.ivoyant.designpattern.adapter;

public class AbstractClass implements TargetInterface{
    ConcreteClass obj=new ConcreteClass();

    @Override
    public void addNum(int a, int b) {
        int res=obj.add(a,b);
        System.out.println(res);
    }

    @Override
    public void subNum(int a, int b) {
        int res= obj.sub(a,b);
        System.out.println(res);

    }
}
