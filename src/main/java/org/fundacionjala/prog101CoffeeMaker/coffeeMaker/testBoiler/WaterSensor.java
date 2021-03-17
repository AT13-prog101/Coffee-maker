package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.testBoiler;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.testInterfaces.Sensor;

public class WaterSensor implements Sensor {
    private boolean stateWater;

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
