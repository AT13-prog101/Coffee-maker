package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.testImplementation;

public class Outputs {
    private String response;

    /**
     * Print method
     *
     * @param message
     */
    public void print(final String message) {
        System.out.println("message : " + message);
    }

    /**
     * print head for Coffee Maker
     */
    public void printHead() {
        System.out.println("-----------------------------------");
        System.out.println("    Welcome to Coffee Maker");
        System.out.println("-----------------------------------");
    }

    /**
     * print instructions
     */
    public void instructions() {
        System.out.println("1. Init Coffee Maker");
        System.out.println("2. Load 12 glasses of water");
        System.out.println("3. Load coffee beans into the filter");
        System.out.println("other. exit");
        System.out.println("-----------------------------------");
    }

    /**
     * Selected any option available
     *
     * @param option
     */
    public void entryOption(final String option, final CoffeeMaker coffeeMaker) {
        final int cupsWater = 12;
        switch (option) {
            case "1":
                System.out.println("Selected option 1");
                if (verifyConditionsForMakeCoffee(coffeeMaker)) {
                    coffeeMaker.getStartButton().isPressed();
                }
                break;
            case "2":
                System.out.println("Selected option 2");
                coffeeMaker.getBoiler().setCapacity(cupsWater);
                if (coffeeMaker.getBoiler().containLiquid()) {
                    System.out.println("The water is ready");
                }
                break;
            case "3":
                System.out.println("Selected option 3");
                coffeeMaker.getFilterAndReceptacle().putCoffeeGrains();
                if (coffeeMaker.getFilterAndReceptacle().getCoffeeGrains()) {
                    System.out.println("The coffee is ready");
                }
                break;
            default:
                System.out.println("Option not available, bye...!!!");
                break;
        }
    }

    /**
     * Verify if there is water and coffee
     *
     * @param coffeeMaker
     */
    public boolean verifyConditionsForMakeCoffee(final CoffeeMaker coffeeMaker) {
        boolean state = true;
        if (!coffeeMaker.getBoiler().containLiquid()) {
            System.out.println("Error : There's no water");
            state = false;
        }
        if (!coffeeMaker.getFilterAndReceptacle().getCoffeeGrains()) {
            System.out.println("Error : There is no coffee in the filter");
            state = false;
        }
        return state;
    }
}
