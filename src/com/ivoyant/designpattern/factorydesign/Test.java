package com.ivoyant.designpattern.factorydesign;

import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String type=sc.next();
        Switch sw=LightFactory.getLight(type);
        if(sw!=null){
            sw.son();
            sw.soff();
        }
    }
}
