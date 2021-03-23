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
        while (!coffeeMaker.obtainsStartButtonState()) {
            outputs.print(outputs.instructions());
            entryOption(inputs.scanner());
            outputs.print("");
        }
        outputs.print(outputs.formatColorGreen("Starting coffee..."));
        coffeeMaker.getBoiler().on();
        while (verifyConditionsForCoffeeMaker()) {
            if (coffeeMaker.isPotOverPlateHeater()) {
                coffeeMaker.makingCoffee();
            } else {
                outputs.print("pause...");
            }
        }
        System.out.println("fin");
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
                loadPotOverHeaterPlatePot();
                break;
            case "5":
                removePotOverPlateHeater();
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
     * Remove the pot from the sensor, checking if it has already been removed
     */
    public void removePotOverPlateHeater() {
        outputs.print(outputs.formatColorGreen("Selected option 5"));
        if (!coffeeMaker.isPotInPlace()) {
            outputs.print(outputs.formatColorYellow("The pot is not longer on the sensor plate"));
        } else {
            outputs.print(outputs.formatColorGreen("Removing the pot ..."));
            coffeeMaker.removePot();
            outputs.print(outputs.formatColorYellow("The pot has been removed."));
        }
    }
    /**
     * Returns the pot on the sensor plate, checking if it has already been returned.
     */
    public void loadPotOverHeaterPlatePot() {
        outputs.print(outputs.formatColorGreen("Selected option 4"));
        if (!coffeeMaker.isPotInPlace()) {
            outputs.print(outputs.formatColorGreen("Placing the pot ..."));
            coffeeMaker.returnPot();
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
            coffeeMaker.pressStartButton();
        } else {
            if (!coffeeMaker.isBoilerWithWater()) {
                outputs.print(outputs.formatError("There is no water on the boiler"));
            }
            if (!coffeeMaker.isFilterWithCoffeeBeans()) {
                outputs.print(outputs.formatError("There is no coffee benas on the filter"));
            }
            if (!coffeeMaker.isPotOverPlateHeater()) {
                outputs.print(outputs.formatError("There is no pot on the sensor plate"));
            }
        }
    }

    /**
     * Verifies if the conditions to start making coffee have been met
     */
    public boolean verifyConditionsForCoffeeMaker() {
        boolean hasWater = coffeeMaker.isBoilerWithWater();
        boolean hasCoffeeBeans = coffeeMaker.isFilterWithCoffeeBeans();
        boolean hasPot = coffeeMaker.isPotOverPlateHeater();
        return  hasWater && hasCoffeeBeans && hasPot;
    }

    /**
     * Added water in CoffeeMaker
     */
    public void loadWater(final int cupsWater) {
        outputs.print(outputs.formatColorGreen("Selected option 2"));
        if (!coffeeMaker.isBoilerWithWater()) {
            outputs.print(outputs.formatColorGreen("Adding water..."));
            coffeeMaker.fillBoilerWithWater(cupsWater);
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
        if (!coffeeMaker.isFilterWithCoffeeBeans()) {
            outputs.print(outputs.formatColorGreen("Adding coffee to the coffee filter..."));
            coffeeMaker.fillFilterWithCoffeeGrains();
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
