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
        if (cupsOfWater > 0) {
            return true;
        }
        return false;
    }

    /**
     * Changes workingBoiler to true.
     */
    @Override
    public void on() {
        workingBoiler = true;
    }

    /**
     * Changes workingBoiler to false.
     */
    @Override
    public void off() {
        workingBoiler = false;
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
    }

    /**
     * obtains if Boiler is working or it's not working
     * @return workingBoiler
     */
    public boolean getWorkingBoiler() {
        return workingBoiler;
    }
}
