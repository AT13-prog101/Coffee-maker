package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.testImplementation;

import java.util.Scanner;

public class Inputs {
    private String option;

    /**
     * Scans all inputs
     * @return String
     */
    public String scanner() {
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextLine();
        return option;
    }
}