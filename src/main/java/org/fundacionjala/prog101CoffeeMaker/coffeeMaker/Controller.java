package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class Controller {
    private CoffeeMaker coffeeMaker;
    private Inputs inputs;
    private Outputs outputs;

    public Controller() {
        coffeeMaker = new CoffeeMaker();
        inputs = new Inputs();
        outputs = new Outputs();
    }

    /**
     * This method initialize the Coffee Maker
     */
    public void initialize() {
        outputs.print("Init Coffee Maker");
    }

}
