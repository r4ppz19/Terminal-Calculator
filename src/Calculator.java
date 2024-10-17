class Calculator {

    // Arithmetic calculator
    double arithmetic(double firstNum, char operator, double secondNum) {
        double result = 0;

        switch (operator) {
            case '+' -> result = firstNum + secondNum;
            case '-' -> result = firstNum - secondNum;
            case '*' -> result = firstNum * secondNum;
            case '/' -> {
                try {
                    if (secondNum == 0) {
                        System.err.println(Main.BRIGHT_RED + "Can't divide by zero" + Main.ANSI_RESET);
                    }
                    result = firstNum / secondNum;
                } catch (ArithmeticException e) {
                    System.err.println(Main.BRIGHT_RED + e.getMessage() + Main.ANSI_RESET);
                }
            }
            case '%' -> {
                try {
                    if (secondNum == 0) {
                        System.err.println(Main.BRIGHT_RED + "Can't divide by zero" + Main.ANSI_RESET);
                    }
                    result = firstNum % secondNum;
                } catch (ArithmeticException e) {
                    System.err.println(Main.BRIGHT_RED + e.getMessage() + Main.ANSI_RESET);
                }
            }
            default -> System.err.println(Main.BRIGHT_RED + "\n" +"Incorrect operator." + Main.ANSI_RESET);
        }
        return result;
    }


}