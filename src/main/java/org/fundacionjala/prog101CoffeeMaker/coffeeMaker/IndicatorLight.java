package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class IndicatorLight {
    private boolean light;

    public void turnOn() {
        light = true;
    }

    public void turnOff() {
        light = false;
    }

    public boolean getLight() {
        return light;
    }

    public void setLight(boolean newLight) {
        this.light = newLight;
    }
}
