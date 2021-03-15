package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class FilterAndReceptacle {
    private boolean coffeeGrains;

    public boolean getCoffeeGrains() {
        coffeeGrains = true;
        return coffeeGrains;
    }
    public boolean getLight() {
        return coffeeGrains;
    }

    public void setLight(boolean grains) {
        this.coffeeGrains = grains;
    }
}
