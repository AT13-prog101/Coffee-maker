package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

import java.util.Scanner;

public class Inputs {
    private String option;

    public String scanner() {
        Scanner scanner = new Scanner();
        option = scanner.nextLine();
        return option;
    }
}
