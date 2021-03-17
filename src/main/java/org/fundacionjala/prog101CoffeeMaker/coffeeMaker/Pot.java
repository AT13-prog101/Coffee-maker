package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class Pot implements Container {
    private boolean isInPlace;
    private boolean containsLiquid;

    /**
     * Returns the state of the container
     * @return boolean
     */
    @Override
    public boolean containLiquid() {
        return containsLiquid;
    }

    /**
     * Gets the place where is the pot
     * @return boolean
     */
    public boolean getIsInPlace() {
        return isInPlace;
    }

    /**
     * Changes the place of the container
     */
    public void setIsInPlace(boolean isInPlacePot) {
        this.isInPlace = isInPlacePot;
    }
}
