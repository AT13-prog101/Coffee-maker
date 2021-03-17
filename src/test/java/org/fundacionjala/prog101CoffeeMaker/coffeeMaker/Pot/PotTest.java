package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pot;

import org.junit.Test;

import static org.junit.Assert.*;

public class PotTest {

    @Test
    public void containLiquid_False() {
        Pot pot = new Pot();
        boolean expected = false;
        boolean actual = pot.containLiquid();
        assertEquals(expected, actual);
    }

    @Test
    public void getIsInPlace_IsInPlace() {
        Pot pot = new Pot();
        boolean expected = false;
        boolean actual = pot.getIsInPlace();
        assertEquals(expected, actual);
    }

    @Test
    public void setIsInPlace_NewStateTrue_True() {
        Pot pot = new Pot();
        boolean newState = true;
        boolean expected = true;
        pot.setIsInPlace(newState);
        boolean actual = pot.getIsInPlace();
        assertEquals(expected, actual);
    }

    @Test
    public void getAmountOfCups_AmountOfCups() {
        Pot pot = new Pot();
        int expected = 0;
        int actual = pot.getAmountOfCups();
        assertEquals(expected, actual);
    }

    @Test
    public void setAmountOfCups_NewAmountFive_Five() {
        Pot pot = new Pot();
        int newAmount = 5;
        int expected = 5;
        pot.setAmountOfCups(newAmount);
        int actual = pot.getAmountOfCups();
        assertEquals(expected, actual);
    }
}