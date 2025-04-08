package com.ivoyant.designpattern.abstractfactory;
import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the type");
        String type = sc.next();

        LightFactory factory = null;

        if (type.equalsIgnoreCase("TubeLight")) {
            factory = new TubeLightFactory();
        } else if (type.equalsIgnoreCase("LedLight")) {
            factory = new LedLightFactory();
        } else {
            System.out.println("No such light found");
        }

        if (factory != null) {
            Switch sw = factory.createLight();
            sw.son();
            sw.soff();
        }
    }
}

