class Main {

    /*
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String BRIGHT_WHITE = "\u001B[37;1m";
     */
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String BRIGHT_RED = "\u001B[31;1m";
    //public static final String BRIGHT_BLUE = "\u001B[34;1m";
    public static final String BRIGHT_GREEN = "\u001B[32;1m";

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Ask ask = new Ask();

        double firstNum;
        double secondNum;
        char operator;
        boolean go = true;

        /*
        System.err.println(BRIGHT_GREEN + "Welcome to the Terminal Arithmetic Calculator!");
        System.err.println("Just use your common sense to use.");
        System.err.println("Developed by r4ppz! \n\n" + ANSI_RESET);
         */


        // Main while loop
        while (go) {
            firstNum = ask.askFirstNum();
            operator = ask.askOperator();
            secondNum = ask.askSecondNum();

            double result = calculator.arithmetic(firstNum, operator, secondNum);
            System.out.println(BRIGHT_GREEN + "\n" + result + "\n" + ANSI_RESET);

            go = ask.askGo();
            Ask.clearConsole();

        }
    }
}