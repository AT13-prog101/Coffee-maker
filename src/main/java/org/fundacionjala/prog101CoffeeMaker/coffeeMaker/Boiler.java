package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class Boiler implements Container, Heater {

    private PressureRelietValve pressureRelietValve;
    private WaterSensor waterSensor;
    private boolean workingBoiler;
    private int cupsOfWater;

    public Boiler(final int newCupsOfWater) {
        pressureRelietValve = new PressureRelietValve();
        waterSensor = new WaterSensor();
        this.cupsOfWater = newCupsOfWater;
    }

    private int capacity;

    /**
     * Returns true if the boiler contains liquid, otherwise false.
     * @return boolean
     */
    @Override
    public boolean containLiquid() {
        if (cupsOfWater > 0) {
            return true;
        }
        return false;
    }

    /**
     * Changes workingBoiler to true.
     */
    @Override
    public void on() {
        workingBoiler = true;
    }

    /**
     * Changes workingBoiler to false.
     */
    @Override
    public void off() {
        workingBoiler = false;
    }

    /**
     * Obtains capacity
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * sets new Boiler capacity.
     * @param newCapacity
     */
    public void setCapacity(final int newCapacity) {
        this.capacity = newCapacity;
    }
}
