package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class StartButton {
    private boolean init;

    /**
     * Description: this method indicates the state of init
     * @return
     */
    public boolean isPressed() {
        init = true;
        return init;
    }

    /**
     * Description: this method returns the state of init
     * @return
     */
    public boolean getInit() {
        return init;
    }

    /**
     * Description: this method changes the state of init
     * @return
     */
    public void setInit(final boolean newInit) {
        this.init = newInit;
    }
}
