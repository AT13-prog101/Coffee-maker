package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.testPieces;

import org.junit.Test;

import static org.junit.Assert.*;

public class FilterAndReceptacleTest {

    @Test
    public void putCoffeeGrains_True() {
        FilterAndReceptacle filterAndReceptacle = new FilterAndReceptacle();
        boolean expected = true;
        boolean actual = filterAndReceptacle.putCoffeeGrains();
        assertEquals(expected, actual);
    }

    @Test
    public void getCoffeeGrains_CoffeeGrainsFalse() {
        FilterAndReceptacle filterAndReceptacle = new FilterAndReceptacle();
        boolean expected = false;
        boolean actual = filterAndReceptacle.getCoffeeGrains();
        assertEquals(expected, actual);
    }
}