package com.ivoyant.designpattern.adapter;

public class Client {
    public static void main(String[] args) {
        AbstractClass obj=new AbstractClass();
        obj.addNum(10,20);
        obj.subNum(30,20);
    }
}
