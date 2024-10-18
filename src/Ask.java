// src/Ask.java
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class Ask {
    Scanner input = new Scanner(System.in);

    // Ask number and loop if it's not a number
    double askNumber(String prompt) {
        double number = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt);
            try {
                number = input.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.err.println(Main.BRIGHT_RED + "Please enter a number!" + Main.ANSI_RESET);
                input.nextLine();
            }
        }
        return number;
    }

    double askFirstNum() {
        return askNumber("First Number: ");
    }

    double askSecondNum() {
        return askNumber("Second Number: ");
    }

    // Ask operator
    char askOperator() {
        System.out.print("Operator: ");
        return input.next().charAt(0);
    }

    // Return bool, true if yes
    boolean askGo() {
        System.out.print("\nTry again? ");
        String ans = input.next();
        return ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("ye") || ans.equalsIgnoreCase("ya") || ans.equalsIgnoreCase("yea");
    }

    // Clear terminal method
    static void clearConsole() {
        try {
            // Clear the console using Windows 'cls' command
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                // Execute the Windows 'cls' command
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Error clearing the console: " + e.getMessage());
        }
    }
}