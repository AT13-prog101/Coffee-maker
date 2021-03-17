package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation;

public class Outputs {
    private String response;
    private final String colorReset = "\u001B[0m";
    private final String colorBlack = "\u001B[30m";
    private final String colorRed = "\u001B[31m";
    private final String colorGreen = "\u001B[32m";
    private final String colorYellow = "\u001B[33m";
    private final String colorBlue = "\u001B[34m";
    private final String colorPurple = "\u001B[35m";
    private final String colorCyan = "\u001B[36m";
    private final String colorWhite = "\u001B[37m";

    /**
     * Print method
     * @param message
     */
    public void print(final String message) {
        System.out.println(message);
    }

    /**
     * Print error in color red
     * @param message
     */
    public String formatError(final String message) {
        return (colorRed + "Error : " + message + colorReset);
    }

    /**
     * Print option selected in color green
     * @param message
     */
    public String formatColorGreen(final String message) {
        return (colorGreen + message + colorReset);
    }

    /**
     * print head for Coffee Maker
     */
    public void printHead() {
        print("-----------------------------------");
        print("    Welcome to Coffee Maker");
        print("-----------------------------------");
    }

    /**
     * print instructions
     */
    public void instructions() {
        print("1. Init Coffee Maker");
        print("2. Load 12 glasses of water");
        print("3. Load coffee beans into the filter");
        print("4. Exit");
        print("-----------------------------------");
    }

    /**
     * Selected any option available
     * @param option
     */
    public void entryOption(final String option, final CoffeeMaker coffeeMaker) {
        switch (option) {
            case "1":
                print(formatColorGreen("Selected option 1"));
                actionForOption1(coffeeMaker);
                break;
            case "2":
                print(formatColorGreen("Selected option 2"));
                actionForOption2(coffeeMaker);
                break;
            case "3":
                print(formatColorGreen("Selected option 3"));
                actionForOption3(coffeeMaker);
                break;
            case "4":
                print(formatColorGreen("Selected option 4, bye...!!!"));
                System.exit(0);
                break;
            default:
                print(formatError("Option not available, choose one of the given above"));
                break;
        }
    }

    /**
     * Verify if there is water and coffee in the coffee maker, if there is, start the coffee process
     * @param coffeeMaker
     */
    public void actionForOption1(final CoffeeMaker coffeeMaker) {
        boolean state = true;
        if (!coffeeMaker.getBoiler().containLiquid()) {
            print(formatError("There's no water"));
            state = false;
        }
        if (!coffeeMaker.getFilterAndReceptacle().getCoffeeGrains()) {
            print(formatError("There is no coffee in the filter"));
            state = false;
        }
        if (state) {
            coffeeMaker.getStartButton().isPressed();
        }
    }

    /**
     * Added water in CoffeeMaker
     * @param coffeeMaker
     */
    public void actionForOption2(final CoffeeMaker coffeeMaker) {
        final int cupsWater = 12;
        if (!coffeeMaker.getBoiler().containLiquid()) {
            print(formatColorGreen("Adding water..."));
            coffeeMaker.getBoiler().setCupsOfWater(cupsWater);
            print(formatColorGreen("The water is ready"));
        } else {
            print(formatColorGreen("The water is ready"));
        }
    }

    /**
     * Added coffee in CoffeeMaker
     * @param coffeeMaker
     */
    public void actionForOption3(final CoffeeMaker coffeeMaker) {
        if (!coffeeMaker.getFilterAndReceptacle().getCoffeeGrains()) {
            print(formatColorGreen("Adding coffee to the coffee filter..."));
            coffeeMaker.getFilterAndReceptacle().putCoffeeGrains();
            print(formatColorGreen("The coffee is ready"));
        } else {
            print(formatColorGreen("The coffee is ready"));
        }
    }
}
