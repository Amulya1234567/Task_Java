package com.ivoyant.designpattern.singleton;

public class SingletonLazy {
    private static SingletonLazy singletonLazy;

    private SingletonLazy(){

    }

    public static SingletonLazy getSingletonLazy(){
        if(singletonLazy==null){
            singletonLazy=new SingletonLazy();
        }
        return singletonLazy;
    }

}
