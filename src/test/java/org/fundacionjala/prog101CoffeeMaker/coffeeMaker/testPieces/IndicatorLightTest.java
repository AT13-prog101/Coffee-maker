package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.testPieces;

import org.junit.Test;

import static org.junit.Assert.*;

public class IndicatorLightTest {

    @Test
    public void turnOn() {
        IndicatorLight indicatorLight = new IndicatorLight();
        boolean expected = true;
        indicatorLight.turnOn();
        boolean actual = indicatorLight.getLightState();
        assertEquals(expected, actual);
    }

    @Test
    public void turnOff() {
        IndicatorLight indicatorLight = new IndicatorLight();
        boolean expected = false;
        indicatorLight.turnOff();
        boolean actual = indicatorLight.getLightState();
        assertEquals(expected, actual);
    }

    @Test
    public void getLight() {
        IndicatorLight indicatorLight = new IndicatorLight();
        boolean expected = false;
        boolean actual = indicatorLight.getLightState();
        assertEquals(expected, actual);
    }

    @Test
    public void setLight() {
        IndicatorLight indicatorLight = new IndicatorLight();
        boolean newState = true;
        boolean expected = true;
        indicatorLight.setLightState(newState);
        boolean actual = indicatorLight.getLightState();
        assertEquals(expected, actual);
    }
}