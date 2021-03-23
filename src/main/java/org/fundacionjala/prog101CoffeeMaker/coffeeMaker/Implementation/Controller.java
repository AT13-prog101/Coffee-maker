package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation;
import java.util.TimerTask;
import java.util.Timer;

public class Controller {
    private CoffeeMaker coffeeMaker;
    private Inputs inputs;
    private Outputs outputs;
    private Timer timer;
    private final int velocityCoffeeMaker = 100;
    private final int delayOfCycleInMilliSeconds = 10;
    private final int numberHundred = 100;
    private int tic;

    private final int intermittencePlateHeater = 14;
    private int counterPlateHeater = 0;
    private boolean messageFinal = true;
    private boolean switchPlateHeater = true;

    private final int intermittenceDrinkCoffee = 14;

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
        timer = new Timer();
        startCoffeeMaker();
    }

    /**
     * make coffee each time
     */
    public void startCoffeeMaker() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (tic % velocityCoffeeMaker == 0) {
                    if (verifyConditionsForCoffeeMaker()) {
                        if (coffeeMaker.isPotOverPlateHeater()) {
                            coffeeMaker.makingCoffee();
                        } else {
                            outputs.print("pause...");
                        }
                    } else {
                        if (messageFinal) {
                            outputs.print(outputs.formatColorGreen("The coffee is ready...!!!"));
                            messageFinal = false;
                        }
                    }
                    counterPlateHeater++;
                    if (counterPlateHeater == intermittencePlateHeater) {
                        if (switchPlateHeater) {
                            outputs.print(outputs.formatColorGreen("PlateHeater is on"));
                            switchPlateHeater = false;
                        } else {
                            outputs.print(outputs.formatColorGreen("PlateHeater is off"));
                            switchPlateHeater = true;
                            if (!coffeeMaker.drinkOneCupCoffee()) {
                                outputs.print(outputs.formatColorGreen("CoffeeMaker is finish"));
                                exit();
                            }
                        }
                        counterPlateHeater = 0;
                    }
                    tic /= numberHundred;
                }

                tic += 1;
            }
        };
        timer.scheduleAtFixedRate(task, 0, delayOfCycleInMilliSeconds);
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
     * Method for remove or load the pot
     */
    public void movingPot(final boolean wantPutPot) {
        if (coffeeMaker.isPotInPlace() && !wantPutPot) {
            actionPot("Removing the pot ...", "The pot has been removed.");
            coffeeMaker.removePot();
        } else {
            if (!coffeeMaker.isPotInPlace() && wantPutPot) {
                actionPot("Placing the pot ...", "The pot is ready");
                coffeeMaker.returnPotToPlateHeater();
            } else {
                outputs.print(outputs.formatColorGreen(sendMessageStatePot()));
            }
        }
    }

    /**
     * messages for the action of the pot
     */
    public void actionPot(final String action, final String ready) {
        outputs.print(outputs.formatColorGreen(action));
        outputs.print(outputs.formatColorGreen(ready));
    }

    /**
     * return messages if the pot is already in place or The pot is not longer on the sensor plate
     * @return boolean
     */
    public String sendMessageStatePot() {
        if (coffeeMaker.isPotInPlace()) {
            return "The pot is already in place";
        }
        return "The pot is not longer on the sensor plate";
    }
    /**
     * Remove the pot from the sensor, checking if it has already been removed
     */
    public void removePotOverPlateHeater() {
        boolean remove = false;
        outputs.print(outputs.formatColorGreen("Selected option 5"));
        movingPot(remove);
    }
    /**
     * Returns the pot on the sensor plate, checking if it has already been returned.
     */
    public void loadPotOverHeaterPlatePot() {
        boolean load = true;
        outputs.print(outputs.formatColorGreen("Selected option 4"));
        movingPot(load);
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
