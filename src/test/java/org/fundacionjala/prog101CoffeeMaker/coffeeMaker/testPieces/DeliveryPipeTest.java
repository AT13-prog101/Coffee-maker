package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.testPieces;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeliveryPipeTest {

    @Test
    public void getDeliveryWarmWater() {
        DeliveryPipe deliveryPipe = new DeliveryPipe();
        boolean expected = true;
        boolean actual = deliveryPipe.getDeliveryWarmWater();
        assertEquals(expected, actual);
    }

    @Test
    public void setDeliveryWarmWater() {
        DeliveryPipe deliveryPipe = new DeliveryPipe();
        boolean newState = false;
        boolean expected = false;
        deliveryPipe.setDeliveryWarmWater(newState);
        boolean actual = deliveryPipe.getDeliveryWarmWater();
        assertEquals(expected, actual);
    }
}