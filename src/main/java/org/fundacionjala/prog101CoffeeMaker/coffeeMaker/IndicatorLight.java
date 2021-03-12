package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class IndicatorLight {
    private boolean light;

    /**
     * Description: this method turns on the light
     * @return
     */
    public void turnOn() {
        light = true;
    }

    /**
     * Description: this method turns off the light
     * @return
     */
    public void turnOff() {
        light = false;
    }

    /**
     * Description: this method get the state of the light
     * @return
     */
    public boolean getLight() {
        return light;
    }

    /**
     * Description: this method change the state of the light
     * @return
     */
    public void setLight(final boolean newLight) {
        this.light = newLight;
    }
}
