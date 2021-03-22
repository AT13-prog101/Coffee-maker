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
    public void isBoilerWithWater_VerifyIfBoilerIsWithWater_False() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        boolean expected = false;
        boolean actual = coffeeMaker.isBoilerWithWater();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPotOverPlateHeater_VerifyIfPotIsOverPlateHeater_False() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        boolean expected = false;
        boolean actual = coffeeMaker.isPotOverPlateHeater();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPotInPlace_VerifyIfPotIsInPlace_False() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        boolean expected = false;
        boolean actual = coffeeMaker.isPotInPlace();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void putPotInNewPlace_RemovingThePotOfPlateHeate_True() {
        boolean newState = true;
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.putPotInNewPlace(newState);
        boolean expected = true;
        boolean actual = coffeeMaker.isPotInPlace();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void putPotInNewPlace_RemovingThePotOfPlateHeate_False() {
        boolean newState = false;
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.putPotInNewPlace(newState);
        boolean expected = false;
        boolean actual = coffeeMaker.isPotInPlace();
        Assert.assertEquals(expected, actual);
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