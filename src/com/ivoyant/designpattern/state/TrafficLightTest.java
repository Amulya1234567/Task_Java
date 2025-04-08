package com.ivoyant.designpattern.state;

public class TrafficLightTest {
    public static void main(String[] args) {
        TrafficLightContext light = new TrafficLightContext();

        light.change();
        light.change();
        light.change();
        light.change();
    }
}
