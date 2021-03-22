package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoffeeMakerTest {

    @Test
    public void isFilterWithCoffeeBeans_VerifyIfFilterIsWithCoffeeBeans_False() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        boolean expected = false;
        boolean actual = coffeeMaker.isFilterWithCoffeeBeans();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isBoilerWithWater() {
    }

    @Test
    public void isPotOverPlateHeater() {
    }

    @Test
    public void getBoiler() {
    }

    @Test
    public void getPlateSensor() {
    }

    @Test
    public void getStartButton() {
    }

    @Test
    public void getIndicatorLight() {
    }

    @Test
    public void getFilterAndReceptacle() {
    }

    @Test
    public void getPot() {
    }

    @Test
    public void getDeliveryPipe() {
    }
}