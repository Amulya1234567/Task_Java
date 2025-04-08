package com.ivoyant.designpattern.abstractfactory;

public class TubeLight implements Switch {
    @Override
    public void son() {
        System.out.println("On the tubelight");
    }

    @Override
    public void soff() {
        System.out.println("Off the tubeight");

    }
}
