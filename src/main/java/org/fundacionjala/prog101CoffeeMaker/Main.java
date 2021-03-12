package org.fundacionjala.prog101CoffeeMaker;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Controller;

public final class Main {

    private Main() {
    }

    public static void main(final String[] args) {
        Controller coffeeMaker = new Controller();
        coffeeMaker.initialize();
    }
}
