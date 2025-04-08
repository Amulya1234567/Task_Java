package com.ivoyant.designpattern.singleton;

public class SingletonStatic {
    private static SingletonStatic singletonStatic;

    static{
        singletonStatic=new SingletonStatic();
    }
    private SingletonStatic(){

    }

    public static SingletonStatic getSingletonStatic(){
        return singletonStatic;
    }
}
