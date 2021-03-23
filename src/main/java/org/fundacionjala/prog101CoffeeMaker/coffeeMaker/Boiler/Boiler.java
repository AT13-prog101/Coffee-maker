package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Boiler;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Interfaces.Container;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Interfaces.Heater;

public class Boiler implements Container, Heater {

    private PressureRelietValve pressureRelietValve;
    private WaterSensor waterSensor;
    private boolean workingBoiler;
    private int cupsOfWater;
    public Boiler() {
        pressureRelietValve = new PressureRelietValve();
        waterSensor = new WaterSensor();
        this.cupsOfWater = 0;
    }

    /**
     * Returns true if the boiler contains liquid, otherwise false.
     * @return boolean
     */
    @Override
    public boolean containLiquid() {
        if (waterSensor.getState()) {
            return true;
        }
        return false;
    }

    /**
     * Changes workingBoiler to true.
     */
    @Override
    public boolean on() {
        if (waterSensor.getState()) {
            pressureRelietValve.close();
            workingBoiler = true;
            return true;
        }
        return false;
    }

    /**
     * Changes workingBoiler to false.
     */
    @Override
    public void off() {
        pressureRelietValve.open();
        workingBoiler = false;
    }

    /**
     *
     */
    public void restOneCup() {
        this.cupsOfWater--;
        if (this.cupsOfWater == 0) {
            waterSensor.thereIsNoWaterInBoiler();
        }
    }

    /**
     * Obtains coups of water
     * @return cupsOfWater
     */
    public int getCupsOfWater() {
        return cupsOfWater;
    }

    /**
     * sets new capacity in coups of water.
     * @param newCupsOfWater
     */
    public void setCupsOfWater(final int newCupsOfWater) {
        this.cupsOfWater = newCupsOfWater;
        waterSensor.thereIsWaterInBoiler();
    }

    /**
     * obtains if Boiler is working or it's not working
     * @return workingBoiler
     */
    public boolean getWorkingBoiler() {
        return workingBoiler;
    }
}
