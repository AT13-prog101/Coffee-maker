package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.testImplementation;

import java.util.Scanner;

public class Inputs {
    private String option;
    private Scanner scanner;

    /**
     * Scans all inputs
     * @return String
     */
    public String scanner() {
        scanner = new Scanner(System.in);
        System.out.println("choose one option :");
        option = scanner.nextLine();
        return option;
    }
}
