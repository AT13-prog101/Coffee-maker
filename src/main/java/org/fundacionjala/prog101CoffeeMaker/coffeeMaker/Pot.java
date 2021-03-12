package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class Pot implements Container {
    private boolean isInPlace;

    /**
     * Description: this method returns the state of the container
     * @return
     */
    @Override
    public boolean containLiquid() {
        return false;
    }

    /**
     * Description: this method gets the state of the container
     * @return
     */
    public boolean getIsInPlace() {
        isInPlace = false;
        return isInPlace;
    }

    /**
     * Description: this method changes the state of the container
     * @return
     */
    public void setIsInPlace(final boolean newPlace) {
        isInPlace = newPlace;
    }
}
