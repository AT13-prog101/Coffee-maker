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

    /*
     * this method only return object boiler
     */
    public Boiler boiler(){
        return boiler;
    }

    /*
     * this method only return object plateSensor
     */
    public PlateSensor plateSensor() {
        return plateSensor;
    }

    /*
     * this method only return object startButton
     */
    public StartButton startButton() {
        return startButton;
    }

    /*
     * this method only return object indicatorLight
     */
    public IndicatorLight indicatorLight() {
        return indicatorLight;
    }

    /*
     * this method only return object filterAndReceptacle
     */
    public FilterAndReceptacle filterAndReceptacle() {
        return filterAndReceptacle;
    }

    /*
     * this method only return object pot
     */
    public Pot pot() {
        return pot;
    }

    /*
     * this method only return object deliveryPipe
     */
    public DeliveryPipe deliveryPipe() {
        return deliveryPipe;
    }
}
