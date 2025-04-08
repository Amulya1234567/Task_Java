package com.ivoyant.designpattern.state;

public class TrafficLightContext {
    private TrafficLightState state;

    public TrafficLightContext() {
        state = new RedLight(); // Initial state
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void change() {
        state.changeLight(this);
    }
}
