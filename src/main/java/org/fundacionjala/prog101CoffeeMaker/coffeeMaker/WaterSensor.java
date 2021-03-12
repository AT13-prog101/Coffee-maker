package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class WaterSensor implements Sensor {
    private boolean stateWater;

    /**
     * return the state of WaterSensor
     * @return boolean
     */
    @Override
    public boolean getState() {
        return stateWater;
    }

    /**
     * Change the stateWater to true
     */
    public void thereIsWater() {
        stateWater = true;
    }

    /**
     * Change the stateWater to false
     */
    public void thereIsNoWater() {
        stateWater = false;
    }
}
