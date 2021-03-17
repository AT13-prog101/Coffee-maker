package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.testBoiler;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoilerTest {

    @Test
    public void containLiquid_ThereIsNoLiquid_False() {
        Boiler boiler = new Boiler();
        boolean expected = false;
        boolean actual = boiler.containLiquid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containLiquid_ThereIsOneCoupOfLiquid_True() {
        Boiler boiler = new Boiler();
        boiler.setCupsOfWater(1);
        boolean expected = true;
        boolean actual = boiler.containLiquid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containLiquid_ThereIsTwelveCoupsOfLiquid_True() {
        Boiler boiler = new Boiler();
        boiler.setCupsOfWater(12);
        boolean expected = true;
        boolean actual = boiler.containLiquid();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void on_HeaterOn_True() {
        Boiler boiler = new Boiler();
        boiler.on();
        boolean expected = true;
        boolean actual = boiler.getWorkingBoiler();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void off_HeaterOff_False() {
        Boiler boiler = new Boiler();
        boiler.off();
        boolean expected = false;
        boolean actual = boiler.getWorkingBoiler();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCupsOfWater_Zero() {
        Boiler boiler = new Boiler();
        boiler.setCupsOfWater(0);
        int expected = 0;
        int actual = boiler.getCupsOfWater();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCupsOfWater_Twelve() {
        Boiler boiler = new Boiler();
        boiler.setCupsOfWater(12);
        int expected = 12;
        int actual = boiler.getCupsOfWater();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setCupsOfWater_NewCapacityZero_Zero() {
        Boiler boiler = new Boiler();
        boiler.setCupsOfWater(0);
        int expected = 0;
        int actual = boiler.getCupsOfWater();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setCupsOfWater_NewCapacityTwelve_Twelve() {
        Boiler boiler = new Boiler();
        boiler.setCupsOfWater(12);
        int expected = 12;
        int actual = boiler.getCupsOfWater();
        Assert.assertEquals(expected, actual);
    }
}