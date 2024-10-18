// src/Calculator.java
class Calculator {

    // Arithmetic calculator
    double arithmetic(double firstNum, char operator, double secondNum) {
        double result = 0;

        switch (operator) {
            case '+' -> result = firstNum + secondNum;
            case '-' -> result = firstNum - secondNum;
            case '*' -> result = firstNum * secondNum;
            case '/' -> {
                if (secondNum == 0) {
                    System.err.println(Main.BRIGHT_RED + "Can't divide by zero" + Main.ANSI_RESET);
                } else {
                    result = firstNum / secondNum;
                }
            }
            case '%' -> {
                if (secondNum == 0) {
                    System.err.println(Main.BRIGHT_RED + "Can't divide by zero" + Main.ANSI_RESET);
                } else {
                    result = firstNum % secondNum;
                }
            }
            default -> System.err.println(Main.BRIGHT_RED + "\n" + "Incorrect operator." + Main.ANSI_RESET);
        }
        return result;
    }
}