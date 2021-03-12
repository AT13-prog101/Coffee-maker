package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class PressureRelietValve {
    private boolean stateValve;

    /**
     * Change the state of stateValve to true
     */
    public void open() {
        stateValve = true;
    }

    /**
     * Change the state of satetCalve to false
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
