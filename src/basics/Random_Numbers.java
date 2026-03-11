package basics;
import java.util.Random;
import java.util.Scanner;

public class Random_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int number;

        number = random.nextInt(); // using the random object we call the nextInt method and this generates a random number

        System.out.println("Your number is " + number); // issue with this is the generated number is between -ve and  +ve 2 billion
        // so, if we want to set bounds for how high the number can go we specify this in parenthesis of the nextInt method

        number = random.nextInt(1, 6); // the first number is inclusive, the second exclusive, as 6 is exclusive we never get 6 only 1-5

        // we can also generate a random double
        double number1;
        number1 = random.nextDouble(); // this will generate a number between 0 and 1
        System.out.println(number1);

        // and also with boolean

        boolean isHeads;
        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("HEADS!");
        }
        else{
            System.out.println("TAILS!");
        }

        scanner.close();
    }
}
