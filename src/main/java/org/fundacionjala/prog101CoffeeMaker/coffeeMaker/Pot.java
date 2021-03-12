package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class Pot implements Container {
    private boolean isInPlace;

    @Override
    public boolean containLiquid() {
        return false;
    }

    public boolean getIsInPlace() {
        isInPlace = false;
        return isInPlace;
    }

    public void setIsInPlace(boolean newPlace) {
        isInPlace = newPlace;
    }





    
}
