package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Boiler;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Interfaces.Sensor;

public class WaterSensor implements Sensor {
    private boolean stateWater;

    /**
     * set new state of water
     * @param newStateWater
     */
    public void setStateWater(final boolean newStateWater) {
        this.stateWater = newStateWater;
    }

    /**
     * returns the state of WaterSensor
     * @return boolean
     */
    @Override
    public boolean getState() {
        return stateWater;
    }

    /**
     * Changes the stateWater to true
     */
    public void thereIsWaterInBoiler() {
        stateWater = true;
    }

    /**
     * Changes the stateWater to false
     */
    public void thereIsNoWaterInBoiler() {
        stateWater = false;
    }
}
