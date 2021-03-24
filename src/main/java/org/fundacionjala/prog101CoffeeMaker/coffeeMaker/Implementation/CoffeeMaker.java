package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Boiler.Boiler;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pieces.DeliveryPipe;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pieces.FilterAndReceptacle;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pieces.IndicatorLight;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pieces.StartButton;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pot.PlateSensor;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pot.Pot;

public class CoffeeMaker {
    private Boiler boiler;
    private PlateSensor plateSensor;
    private StartButton startButton;
    private IndicatorLight indicatorLight;
    private FilterAndReceptacle filterAndReceptacle;
    private Pot pot;
    private DeliveryPipe deliveryPipe;

    public CoffeeMaker() {
        boiler = new Boiler();
        plateSensor = new PlateSensor();
        startButton = new StartButton();
        indicatorLight = new IndicatorLight();
        filterAndReceptacle = new FilterAndReceptacle();
        pot = new Pot();
        deliveryPipe = new DeliveryPipe();
    }

    /**
     * Fills the boiler with cups of water
     */
    public void fillBoilerWithWater(final int cupsWater) {
        boiler.setCupsOfWater(cupsWater);
    }

    /**
     * Fills the filter with coffee grains
     */
    public void fillFilterWithCoffeeGrains() {
        filterAndReceptacle.putCoffeeGrains();
    }

    /**
     * Returns the state of the startButton
     * @return boolean
     */
    public boolean obtainsStartButtonState() {
        return startButton.getButtonPressed();
    }

    /**
     * Changes the state of the startButton
     */
    public void pressStartButton() {
        startButton.pressed();
    }

    /**
     * Returns true if the pot is it's place
     * @return boolean
     */
    public boolean isPotInPlace() {
        return plateSensor.getState();
    }

    /**
     * Removes the pot from the plateSensor
     */
    public void removePot() {
        plateSensor.setState(false);
    }

    /**
     * Return the pot to it's place on the plateSensor
     */
    public void returnPotToPlateHeater() {
        plateSensor.setState(true);
    }

    /**
     * Returns true if the filter contains coffee grains
     * @return boolean
     * making coffee
     */
    public void makingCoffee() {
        boiler.restOneCup();
        pot.plusOneCup();
        System.out.println(boiler.getCupsOfWater() + " " + pot.getAmountOfCups());
    }

    /**
     * A
     * @return
     */
    public boolean isFilterWithCoffeeBeans() {
        return filterAndReceptacle.getCoffeeGrains();
    }

    /**
     * Returns true if the boiler contains water
     * @return boolean
     */
    public boolean isBoilerWithWater() {
        return boiler.containLiquid();
    }

    /**
     * Returns true if the pot is on the plateSensor
     * @return boolean
     */
    public boolean isPotOverPlateHeater() {
        return plateSensor.getState();
    }

    /**
     * Gets the boiler
     * @return Boiler
     */
    public Boiler getBoiler() {
        return boiler;
    }

    /**
     * Gets the plate sensor
     * @return PlateSensor
     */
    public PlateSensor getPlateSensor() {
        return plateSensor;
    }

    /**
     * Gets the start button
     * @return StartButton
     */
    public StartButton getStartButton() {
        return startButton;
    }

    /**
     * Gets the indicator light
     * @return IndicatorLight
     */
    public IndicatorLight getIndicatorLight() {
        return indicatorLight;
    }

    /**
     * Gets the filter and receptacle
     * @return FilterAndReceptacle
     */
    public FilterAndReceptacle getFilterAndReceptacle() {
        return filterAndReceptacle;
    }

    /**
     * Gets the pot
     * @return Pot
     */
    public Pot getPot() {
        return pot;
    }

    /**
     * Gets the delivery pipe.
     * @return DeliveryPipe state
     */
    public DeliveryPipe getDeliveryPipe() {
        return deliveryPipe;
    }
}
