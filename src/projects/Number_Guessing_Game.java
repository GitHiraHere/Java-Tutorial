package projects;
import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {
    static void main(String[] args) {
        /*
        * Create a random number object
        * Create a scanner object
        * create variables, ask user to determine the range they want, input from user as to what their guess is
        * extra: could have a life system, similar to hangman, potentially use the while loop we just learnt
        *
        * note: he used a predetermined choose between 1-10, he also used a do while loop, as well as print f statements https://kappa.lol/t5kOyl
        *
        */

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int range1;
        int range2;
        int number;
        int guesses = 0;
        int answer = 0;

        System.out.println("First, we will choose the range of numbers you want to guess between!");
        System.out.print("Select the first number: "); //first number is inclusive
        range1 = scanner.nextInt();
        System.out.print("Select the second number, this value is exclusive so add +1 to the range you're wanting: "); //second is exclusive, so the number defined is not used
        range2 = scanner.nextInt();

        number = random.nextInt(range1, range2);

        System.out.println("\nNumber has been decided! Let the game begin, every wrong answer takes away a point, don't lose! :D");
        System.out.println("\nCurrent health:");
        System.out.println("5 guesses available - ❤️[█████]"); //https://emojicombos.com/life-bar-ascii-art

        while(answer != number) {
            System.out.println("\nEnter your guess: ");
            answer = scanner.nextInt();

            if (answer == number) {
                System.out.println("\nYou correctly guessed the number in " + guesses + " attempts!");
            } else {
                System.out.println("Incorrect! Keep guessing");
                System.out.println("       .\n" +
                        "      \":\"\n" +
                        "    ___:____     |\"\\/\"|\n" +
                        "  ,'        `.    \\  /\n" +
                        "  |  O        \\___/  |\n" +
                        "~^~^~^~^~^~^~^~^~^~^~^~^~\n"); //https://www.asciiart.eu/art/ded1c74345581414
                guesses++; //https://stackoverflow.com/questions/2371118/how-do-the-post-increment-i-and-pre-increment-i-operators-work-in-java
                //++variable (pre-increment) increments first, then uses the new value.
                //variable++ (post-increment) uses the current value first, then increments it.
            }
        }
                System.out.println("With the following health: ");
                if(guesses == 0){
                    System.out.println("❤️[█████]");
                } else if(guesses == 1){
                    System.out.println("❤️[████░]");
                } else if(guesses == 2){
                    System.out.println("❤️[███░░]");
                } else if(guesses == 3){
                    System.out.println("❤️[██░░░]");
                } else if(guesses == 4){
                    System.out.println("❤️[█░░░░]");
                } else if(guesses == 5){
                    System.out.println("❤️[░░░░░]");
                }else{
                    System.out.println("Something went wrong loading your health!");
                }

    }
}
