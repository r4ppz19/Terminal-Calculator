import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class Ask {
    Scanner input = new Scanner(System.in);

    // Ask first number and loop if it's not a number
    double askFirstNum() {
        double firstNum = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("First Number: ");
            try {
                firstNum = input.nextDouble();
                valid = true;

            } catch(InputMismatchException e) {
                System.err.println(Main.BRIGHT_RED + "Please enter a number!" + Main.ANSI_RESET);
                input.nextLine();
            }
        }
        return firstNum;
    }


    // Ask second number and loop if it's not a number
    double askSecondNum() {
        double secondNum = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Second Number: ");
            try {
                secondNum = input.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.err.println(Main.BRIGHT_RED + "Please enter a number" + Main.ANSI_RESET);
                input.nextLine();
            }
        }
        return secondNum;
    }


    // Ask operator
    char askOperator() {
        System.out.print("Operator: ");
        input.nextLine();
        return input.nextLine().charAt(0);
    }


    // Return bool, true if yes
    boolean askGo() {
        System.out.print("\nTry again? ");
        input.nextLine();
        String ans = input.nextLine();

        if (ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("ye") || ans.equalsIgnoreCase("ya") || ans.equalsIgnoreCase("yea")) {
            return true;
        }
        else {
            return false;
        }
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
