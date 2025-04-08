package com.ivoyant.designpattern.abstractfactory;

public class TubeLightFactory implements LightFactory{
    @Override
    public Switch createLight() {
        return new TubeLight();
    }

}
