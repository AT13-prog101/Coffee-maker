package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.pot;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.interfaces.Container;

public class Pot implements Container {
    private boolean isInPlace;
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
    public boolean getIsInPlace() {
        return isInPlace;
    }

    /**
     * Changes the amount of cups
     */
    public void setIsInPlace(final boolean isInPlacePot) {
        this.isInPlace = isInPlacePot;
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
}