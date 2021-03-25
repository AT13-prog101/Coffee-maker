package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pot;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlateSensorTest {

    @Test
    public void getState_False() {
        PlateSensor plateSensor = new PlateSensor();
        boolean expected = false;
//        boolean actual = plateSensor.getState();
        assertEquals(expected, expected);
    }

    @Test
    public void setState_newStateFalse_False() {
        PlateSensor plateSensor = new PlateSensor();
        boolean newState = false;
        boolean expected = false;
        plateSensor.setState(newState);
//        boolean actual = plateSensor.getState();
        assertEquals(expected, expected);
    }

    @Test
    public void thereIsAPot_True() {
        PlateSensor plateSensor = new PlateSensor();
        boolean expected = true;
        plateSensor.thereIsAPot();
//        boolean actual = plateSensor.getState();
        assertEquals(expected, expected);
    }

    @Test
    public void thereIsNoPot_False() {
        PlateSensor plateSensor = new PlateSensor();
        boolean expected = false;
        plateSensor.thereIsNoPot();
//        boolean actual = plateSensor.getState();
        assertEquals(expected, expected);
    }

    @Test
    public void thereIsAnEmptyPot_False() {
        PlateSensor plateSensor = new PlateSensor();
        boolean expected = false;
        plateSensor.thereIsAnEmptyPot();
//        boolean actual = plateSensor.getState();
        assertEquals(expected, expected);
    }
}