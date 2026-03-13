package basics;

public class Ternary_Operator {
    public static void main(String[] args) {
        /* ternary operator ? = Return 1 of 2 values if a condition is true, it is sort of like asking a question is a true then
        * we return a value if not return b
        *
        * variable = (condition) ? ifTrue : ifFalse;
        * A ternary operator is a simplified version of an if else statement
        */


        int score = 20;
        // We could write our statement like this
        if(score >= 60){
            System.out.println("PASS");
        } else{
            System.out.println("FAIL");
        }

        // Or we could simplify it to
        String passOrFail = (score >= 60) ? "PASS" : "FAIL"; // is score >= 60 ?(question) then print pass :(or) print fail
        System.out.println(passOrFail);

        // We can check if a number is even or odd using the modulus operator
        int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
    }
}
