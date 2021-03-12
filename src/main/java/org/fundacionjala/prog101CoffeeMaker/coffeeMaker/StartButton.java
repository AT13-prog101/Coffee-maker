package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class StartButton {
    private boolean init;

    public boolean isPressed() {
        init = true;
        return init;
    }

    public boolean getInit() {
        return init;
    }

    public void setInit(boolean newInit) {
        this.init = newInit;
    }
}
