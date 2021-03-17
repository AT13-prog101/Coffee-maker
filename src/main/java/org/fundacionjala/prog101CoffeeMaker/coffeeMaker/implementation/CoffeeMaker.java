package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.implementation;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.boiler.Boiler;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.pieces.DeliveryPipe;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.pieces.FilterAndReceptacle;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.pieces.IndicatorLight;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.pieces.StartButton;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.pot.PlateSensor;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.pot.Pot;

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
     * @return
     */
    public DeliveryPipe getDeliveryPipe() {
        return deliveryPipe;
    }
}
