package com.ivoyant.designpattern.factorydesign;

public class LedLight implements Switch{
    @Override
    public void son() {
        System.out.println("Tubelight switch on");
    }

    @Override
    public void soff() {
        System.out.println("Tubelight switch off");
    }
}
