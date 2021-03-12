package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class PlateSensor implements Sensor {
    private boolean statePlate;

    /**
     * Description: this method returns the state of PlateSensor
     * @return
     */
    @Override
    public boolean getState() {
        return this.statePlate;
    }

    /**
     * Description: this method indicates if there is a pot on the sensor
     * @return
     */
    public void thereIsAPot() {
        statePlate = true;
    }

    /**
     * Description: this method indicates if there is not a pot on the sensor
     * @return
     */
    public void thereIsNoPot() {
        statePlate = false;
    }

    /**
     * Description: this method indicates if there is a empty pot on the sensor
     * @return
     */
    public void thereIsAnEmptyPot() {
        statePlate = false;
    }

}
