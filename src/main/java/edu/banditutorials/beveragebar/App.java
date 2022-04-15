package edu.banditutorials.beveragebar;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 * This App is a simulation created by the 542 team.
 *
 * @author Ajay Bandi
 */
public class App {

    // Specify welcome message
    private static final String GREETING_MESSAGE = "Welcome to our 542 Quenchers!";

    // Specify how to exit message
    private static final String ESCAPE_MESSAGE = "Hit Q to exit.";

    // Specify goodbye string
    private static final String GOODBYE_MESSAGE = "Thank you for visiting!";

    // specify number of  custom types available - UPDATE AS IT GROWS! 
    private static final int NUMBER_CUSTOM_TYPES = 7;

    /**
     * This main() method is the entry point for our application.
     *
     * @param args - inputs provided to the program (none required)
     */
    public static void main(String[] args) {

        // output welcome
        System.out.println(GREETING_MESSAGE);

        // output how to escape
        System.out.println(ESCAPE_MESSAGE);

        try (// construct Scanner and begin interaction
                var scanner = new Scanner(System.in)) {

            // Prompt for topic: ask if they want to see animals
            System.out.println("Do you want to see our specials (y/n)?");
            var interestInput = scanner.next();

            // if yes, show list
            if (interestInput.toUpperCase().startsWith("Y")) {

                // declare an int for the custom type number input
                int typeNumberInput;

                // declare a boolean for isValid
                boolean isValid;

                // do the list prompt for the first time, loop back while valid
                do {
                    // Prompt for type: ask if they want to see our options
                    System.out.println();
                    System.out.println("-------------------------------------");
                    System.out.println("Which beverage would you like to see?");
                    System.out.println("Enter a number to choose, 0 to exit.");
                    // Run UtilityBuildSwitch to get autogenerated switch and menu
                    // Replace the menu below as it grows
                    // Remember to also change the value of NUMBER_CUSTOM_TYPES above.
                    System.out.print(" 1.Coffee              ");
                    System.out.print(" 2.Milk                ");
                    System.out.print(" 3.Tea                 ");
                    System.out.print(" 7.Lemonade                 ");

                    // END PASTE - right-click / Format
                    System.out.println();
                    try {
                        typeNumberInput = scanner.nextInt();
                    } catch (Exception ex) {
                        typeNumberInput = 0;
                    }

                    // set isValid if >= 1 and <= number of custom types
                    isValid = typeNumberInput >= 1 && typeNumberInput <= NUMBER_CUSTOM_TYPES;

                    // switch by custom type - autogenerate with AppBuildSwitch.java
                    switch (typeNumberInput) {

                        // Run UtilityBuildSwitch.java and paste the 
                        // autogenerated switch code here............
                        case 1 -> {
                            var b = new Coffee("Coffee");
                            var n = b.getName();
                            var d = b.getDescription();
                            System.out.println("I'm " + n + ", a " + d + ".");
                        }
                        case 2 -> {
                            var b = new Milk("Milk");
                            var n = b.getName();
                            var d = b.getDescription();
                            System.out.println("I'm " + n + ", a " + d + ".");
                        }
                        case 3 -> {
                            var b = new Tea("Tea");
                            var n = b.getName();
                            var d = b.getDescription();
                            System.out.println("I'm " + n + ", a " + d + ".");
                        }
                       

                        //// END PASTE (right-click and Format )
                        default -> {
                        }

                    }

                    // while the input is valid, we loop back
                } while (isValid);

            }

        }

        // output goodbye
        System.out.println(GOODBYE_MESSAGE);
    }
}
