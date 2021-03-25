package org.fundacionjala.prog101CoffeeMaker;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation.Controller;

public final class Main {

    private Main() {
    }

    public static void main(final String[] args) throws InterruptedException {
        Controller coffeeMaker = new Controller();
        coffeeMaker.initialize();
    }
}
