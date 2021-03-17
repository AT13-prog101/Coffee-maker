package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class StartButton {
    private boolean buttonPressed;

    /**
     * Indicates the state of the buttonPressed
     * @return boolean
     */
    public boolean isPressed() {
        buttonPressed = true;
        return buttonPressed;
    }

    /**
     * Description: this method returns the state of the buttonPressed
     * @return boolean
     */
    public boolean getButtonPressed() {
        return buttonPressed;
    }

    /**
     * Changes the state of the buttonPressed
     */
    public void setInit(final boolean newStateButton) {
        this.buttonPressed = newStateButton;
    }
}
