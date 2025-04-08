package com.ivoyant.designpattern.factorydesign;

public class LightFactory {
    public static Switch getLight(String type){
        if(type.equalsIgnoreCase("TubeLight")){
            return new TubeLight();
        }
        else if(type.equalsIgnoreCase("LedLight")){
            return new LedLight();
        }
        else{
            System.out.println("No such light found");
            return null;
        }
    }
}
