package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pot;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Interfaces.Container;

public class Pot implements Container {
    private boolean containsLiquid;
    private int amountOfCups;

    /**
     * Returns the state of the container
     *
     * @return boolean
     */
    @Override
    public boolean containLiquid() {
        return containsLiquid;
    }

    /**
     * Gets the place where is the pot
     *
     * @return boolean
     */
    public int getAmountOfCups() {
        return amountOfCups;
    }

    /**
     * Changes the amount of cups
     */
    public void setAmountOfCups(final int newAmountOfCups) {
        this.amountOfCups = newAmountOfCups;
    }

    /**
     * Plus one cup of coffee
     */
    public void plusOneCup() {
        this.amountOfCups++;
    }
}
