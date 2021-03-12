package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class PlateSensor implements Sensor {
    private boolean statePlate;

    @Override
    public boolean getState() {
        return this.statePlate;
    }

    public void thereIsAPot() {
        statePlate = true;
    }

    public void thereIsNoPot() {
        statePlate = false;
    }

    public void thereIsAnEmptyPot() {
        statePlate = false;
    }

}
