package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class PressureRelietValve {
    private boolean stateValve;

    /**
     * Opens the valve changing the state of stateValve to true
     */
    public void open() {
        stateValve = true;
    }

    /**
     * Closes the valve changing the state of stateValve to false
     */
    public void close() {
        stateValve = false;
    }

    /**
     * Return the state valve
     * @return stateValve
     */
    public boolean stateValve() {
        return stateValve;
    }
}
