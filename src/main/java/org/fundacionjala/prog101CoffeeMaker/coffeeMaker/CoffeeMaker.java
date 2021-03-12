package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

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
     * This method only return object boiler
     * @return Boiler
     */
    public Boiler boiler() {
        return boiler;
    }

    /**
     * This method only return object plateSensor
     * @return PlateSensor
     */
    public PlateSensor plateSensor() {
        return plateSensor;
    }

    /**
     * This method only return object startButton
     * @return StartButton
     */
    public StartButton startButton() {
        return startButton;
    }

    /**
     * This method only return object indicatorLight
     * @return IndicatorLight
     */
    public IndicatorLight indicatorLight() {
        return indicatorLight;
    }

    /**
     * this method only return object filterAndReceptacle
     * @return FilterAndReceptacle
     */
    public FilterAndReceptacle filterAndReceptacle() {
        return filterAndReceptacle;
    }

    /**
     * This method only return object pot
     * @return Pot
     */
    public Pot pot() {
        return pot;
    }

    /**
     * This method only return object deliveryPipe
     * @return
     */
    public DeliveryPipe deliveryPipe() {
        return deliveryPipe;
    }
}
