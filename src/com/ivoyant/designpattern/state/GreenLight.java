package com.ivoyant.designpattern.state;

public class GreenLight extends TrafficLightState {
    @Override
    public void changeLight(TrafficLightContext context) {
        System.out.println("Green light to Turn Yellow");
        context.setState(new YellowLight());
    }
}
