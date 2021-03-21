package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pot;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Interfaces.Sensor;

public class PlateSensor implements Sensor {
    private boolean statePlate = false;

    /**
     * Returns the state of plateSensor
     * @return boolean
     */
    @Override
    public boolean getState() {
        return this.statePlate;
    }

    /**
     * Sets the state of plateSensor
     */
    public void setState(final boolean newStatePlate) {
        this.statePlate = newStatePlate;
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
