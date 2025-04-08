package com.ivoyant.designpattern.singleton;



public class SingletonThreadSafe {
    private static SingletonThreadSafe singletonThreadSafe;

    private SingletonThreadSafe(){

    }

    public static SingletonThreadSafe getSingletonThreadSafe(){
        synchronized (SingletonThreadSafe.class){
            if(singletonThreadSafe==null){
            singletonThreadSafe=new SingletonThreadSafe();
            }
        return singletonThreadSafe;
    }
}
}
