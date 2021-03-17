package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.testPieces;

import org.junit.Test;

import static org.junit.Assert.*;

public class StartButtonTest {

    @Test
    public void isPressed() {
        StartButton button = new StartButton();
        boolean expected = true;
        boolean actual = button.isPressed();
        assertEquals(expected, actual);
    }

    @Test
    public void getButtonPressed() {
        StartButton button = new StartButton();
        boolean expected = false;
        boolean actual = button.getButtonPressed();
        assertEquals(expected, actual);
    }

    @Test
    public void setButtonState() {
        StartButton button = new StartButton();
        boolean newState = true;
        boolean expected = true;
        button.setButtonState(newState);
        boolean actual = button.getButtonPressed();
        assertEquals(expected, actual);
    }
}