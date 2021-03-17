package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation;

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
     * Initialize the Coffee Maker
     */
    public void initialize() {
        outputs.printHead();

        while (!coffeeMaker.getBoiler().containLiquid() || !coffeeMaker.getFilterAndReceptacle().getCoffeeGrains() || !coffeeMaker.getStartButton().getButtonPressed()) {
            outputs.instructions();
            outputs.entryOption(inputs.scanner(), coffeeMaker);
            outputs.print("");
        }

        outputs.print(outputs.formatColorGreen("Starting coffee..."));

    }

}
