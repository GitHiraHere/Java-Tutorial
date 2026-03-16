package projects;
import java.util.Scanner;

public class Calculator_Program {
    public static void main(String[] args) {
        /*
         * This project is to practice using enhanced switches
         *
         * Declare scanner, variables (num1, num2, operator)
         * Taken the variable names from bro code, code is my own and will compare to his solution afterwards
         * Print result using printf
         *
         * Notes:
         * So he did use char but used scanner.next().charAt(0); next gives us a string then we method chain charAt(0)
         * He prints out his result after the switch rather than in it
         * he also offered doing ^ using Math.pow
         * for division he used an if statement to prevent outputs giving infinity (3.14/0)
         *
         * case "/" -> { if(num2 == 0){
         *      System.out.print("You cannot divide by 0!");
         *      validOpertation = false; his boolean variable that checks if the operator is one he specifically asks for
         * }else{
         *      result = num1 / num2;
         *  }
         * }
         * he also added a var to check if the operator entered was valid, added it to his default statement validOperator = false;
         * followed by an if statement that checks if the operator is valid only then print a result
         */

        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        String operator;
        double result;

        System.out.print("What operation would you like to perform?: ");
        operator = scanner.nextLine(); // Java does not have a nextChar method, so we can use String instead

        System.out.print("What is the first number?: ");
        num1 = scanner.nextDouble();

        System.out.print("What is the second number?: ");
        num2 = scanner.nextDouble();

        //https://stackoverflow.com/questions/65657169/what-are-switch-expressions-and-how-are-they-different-from-switch-statements
        // Switch statement = one case, you use the :
        // Switch expression multiple cases for one print statement i.e M,T,W,T,F all can print out it is the weekend! you use ->

        switch(operator){
            case "+": result = num1 + num2;
                    System.out.printf("%.2f", result);
                    return;
            case "-": result = num1 - num2;
                    System.out.printf("%.2f", result);
                    return;
            case "*": result = num1 * num2;
                    System.out.printf("%.2f", result);
                    return;
            case "/": result = num1 / num2;
                    System.out.printf("%.2f", result);
                    return;

            default: System.out.println("Something went wrong!");
        }

        scanner.close();
    }
}
