package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.pot;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.interfaces.Sensor;

public class PlateSensor implements Sensor {
    private boolean statePlate;

    /**
     * Returns the state of plateSensor
     * @return boolean
     */
    @Override
    public boolean getState() {
        return this.statePlate;
    }

    /**
     * Changes the state of the statePlate to True
     */
    public void thereIsAPot() {
        statePlate = true;
    }

    /**
     * Changes the state of the statePlate to False
     */
    public void thereIsNoPot() {
        statePlate = false;
    }

    /**
     * Changes the state of the statePlate to False
     */
    public void thereIsAnEmptyPot() {
        statePlate = false;
    }

}
