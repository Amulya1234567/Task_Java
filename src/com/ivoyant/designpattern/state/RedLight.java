package com.ivoyant.designpattern.state;

public class RedLight extends TrafficLightState {
    @Override
    public void changeLight(TrafficLightContext context) {
        System.out.println("Red light to Turn Green");
        context.setState(new GreenLight());
    }
}
