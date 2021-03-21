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
        outputs.print(outputs.printHead());
        while (!coffeeMaker.getStartButton().getButtonPressed() || !coffeeMaker.getPlateSensor().getState()) {
            outputs.print(outputs.instructions());
            entryOption(inputs.scanner());
            outputs.print("");
        }
        outputs.print(outputs.formatColorGreen("Starting coffee..."));
    }
    /**
     * Selected any option available
     * @param option
     */
    public void entryOption(final String option) {
        final int cupsWater = 12;
            switch (option) {
                case "1":
                    initCoffeeMaker();
                    break;
                case "2":
                    loadWater(cupsWater);
                    break;
                case "3":
                    loadCoffeeBeans();
                    break;
                case "4":
                    loadPotOverHeater();
                    break;
                case "5":
                    removePotOverHeater();
                    break;
                case "6":
                    exit();
                    break;
                default:
                    outputs.print(outputs.formatError("Option not available, choose one of the given above"));
                    break;
            }
    }

    /**
     * remove the pot of the sensor plate
     */
    public void removePotOverHeater() {
        outputs.print(outputs.formatColorGreen("Selected option 5"));
        if (!coffeeMaker.getPot().getIsInPlace()) {
            outputs.print(outputs.formatColorYellow("The pot is not longer on the sensor plate"));
        } else {
            outputs.print(outputs.formatColorGreen("removing the pot ..."));
            coffeeMaker.getPot().setIsInPlace(false);
            outputs.print(outputs.formatColorYellow("The pot has been removed."));
        }
    }
    /**
     * Load the pot on the sensor plate
     */
    public void loadPotOverHeater() {
        outputs.print(outputs.formatColorGreen("Selected option 4"));
        if (!coffeeMaker.getPot().getIsInPlace()) {
            outputs.print(outputs.formatColorGreen("Placing the pot ..."));
            coffeeMaker.getPot().setIsInPlace(true);
            outputs.print(outputs.formatColorGreen("The pot is ready"));
        } else {
            outputs.print(outputs.formatColorYellow("The pot is already in place"));
        }
    }
    /**
     * Verify if there is water and coffee in the coffee maker, if there is, start the coffee process
     */
    public void initCoffeeMaker() {
        outputs.print(outputs.formatColorGreen("Selected option 1"));
        if (verifyConditionsForCoffeeMaker()) {
            coffeeMaker.getStartButton().isPressed();
            coffeeMaker.getPlateSensor().thereIsAPot();
        } else {
            outputs.print(outputs.formatError("There are no water or no coffee beans in the filter or pot"));
        }
    }

    /**
     * Verifies if the conditions to start making coffee have been met
     */
    public boolean verifyConditionsForCoffeeMaker() {
        boolean state = true;
        if (!containLiquid()) {
            state = false;
        }
        if (!containCoffeeBeans()) {
            state = false;
        }
        if (!potInPlace()) {
            state = false;
        }
        return state;
    }

    /**
     * check if it has water
     * @return
     */
    public boolean potInPlace() {
        if (!coffeeMaker.getPot().getIsInPlace()) {
            return false;
        }
        return true;
    }
    /**
     * check if it has water
     * @return
     */
    public boolean containLiquid() {
        if (!coffeeMaker.getBoiler().containLiquid()) {
            return false;
        }
        return true;
    }

    /**
     * check if it has coffee beans in the filter
     * @return
     */
    public boolean containCoffeeBeans() {
        if (!coffeeMaker.getFilterAndReceptacle().getCoffeeGrains()) {
            return false;
        }
        return true;
    }


    /**
     * Added water in CoffeeMaker
     */
    public void loadWater(final int cupsWater) {
        outputs.print(outputs.formatColorGreen("Selected option 2"));
        if (!containLiquid()) {
            outputs.print(outputs.formatColorGreen("Adding water..."));
            coffeeMaker.getBoiler().setCupsOfWater(cupsWater);
            outputs.print(outputs.formatColorGreen("The water is ready"));
        } else {
            outputs.print(outputs.formatColorYellow("No more water can be inserted"));
        }
    }

    /**
     * Added coffee in CoffeeMaker
     */
    public void loadCoffeeBeans() {
        outputs.print(outputs.formatColorGreen("Selected option 3"));
        if (!containCoffeeBeans()) {
            outputs.print(outputs.formatColorGreen("Adding coffee to the coffee filter..."));
            coffeeMaker.getFilterAndReceptacle().putCoffeeGrains();
            outputs.print(outputs.formatColorGreen("The coffee is ready"));
        } else {
            outputs.print(outputs.formatColorYellow("No more coffee can be inserted"));
        }
    }

    /**
     * close all program
     */
    public void exit() {
        outputs.print(outputs.formatColorGreen("Selected option 4, bye...!!!"));
        System.exit(0);
    }
}
