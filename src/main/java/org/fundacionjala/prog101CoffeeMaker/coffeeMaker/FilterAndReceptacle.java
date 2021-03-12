package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class FilterAndReceptacle {
    private boolean coffeeGrains;

    /**
     * Description: this method get the state of the coffee grains
     *
     * @return
     */
    public boolean getCoffeeGrains() {
        coffeeGrains = true;
        return coffeeGrains;
    }

    /**
     * Description: this method get the state of the coffee grains
     * @return
     */
    public void setCoffeeGrains(final boolean grains) {
        this.coffeeGrains = grains;
    }
}
