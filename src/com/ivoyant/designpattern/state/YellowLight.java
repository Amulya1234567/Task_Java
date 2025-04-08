package com.ivoyant.designpattern.state;

public class YellowLight extends TrafficLightState {
    @Override
    public void changeLight(TrafficLightContext context) {
        System.out.println("Yellow light to Turn Red");
        context.setState(new RedLight());
    }
}
