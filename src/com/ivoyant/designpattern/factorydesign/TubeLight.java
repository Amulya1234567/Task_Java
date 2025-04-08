package com.ivoyant.designpattern.factorydesign;

public class TubeLight implements Switch{
    @Override
    public void son() {
        System.out.println("Tubelight switch on");
    }

    @Override
    public void soff() {
        System.out.println("TubeLight switch of");

    }
}
