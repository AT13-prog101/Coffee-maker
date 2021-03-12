package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class Boiler implements Container{
    private int capacity;
    public WaterSensor waterSensor;
    public PressureRelietValve pressureRelietValve;

    @Override
    public boolean containLiquid() {
        return false;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
