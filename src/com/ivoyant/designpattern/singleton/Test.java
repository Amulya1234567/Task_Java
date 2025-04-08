package com.ivoyant.designpattern.singleton;

public class Test {
    public static void main(String[] args) {

//        Singletom Eager
        SingletonEager singletonEager1=SingletonEager.getSingletonEager();
        System.out.println(singletonEager1.hashCode());
        SingletonEager singletonEager2=SingletonEager.getSingletonEager();
        System.out.println(singletonEager2.hashCode());

//        Singleton static
        SingletonStatic singletonStatic1=SingletonStatic.getSingletonStatic();
        System.out.println(singletonStatic1.hashCode());
        SingletonStatic singletonStatic2=SingletonStatic.getSingletonStatic();
        System.out.println(singletonStatic2.hashCode());


        SingletonLazy singletonLazy1=SingletonLazy.getSingletonLazy();
        System.out.println(singletonLazy1.hashCode());
        SingletonLazy singletonLazy2=SingletonLazy.getSingletonLazy();
        System.out.println(singletonLazy2.hashCode());

        SingletonThreadSafe singletonThreadSafe1=SingletonThreadSafe.getSingletonThreadSafe();
        System.out.println(singletonThreadSafe1.hashCode());
        SingletonThreadSafe singletonThreadSafe2=SingletonThreadSafe.getSingletonThreadSafe();
        System.out.println(singletonThreadSafe2.hashCode());
    }
}
