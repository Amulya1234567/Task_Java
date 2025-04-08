package com.ivoyant.designpattern.abstractfactory;

public class LedLightFactory implements LightFactory{
    @Override
    public Switch createLight() {
        return new LedLight();
    }
}
