package com.ivoyant.designpattern.abstractfactory;

public class LedLight implements Switch{
    @Override
    public void son() {
        System.out.println("On the LedLight");
    }

    @Override
    public void soff() {
        System.out.println("off the Ledlight");
    }
}
