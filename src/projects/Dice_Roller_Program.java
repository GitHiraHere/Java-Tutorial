package projects;

import java.util.Scanner;
import java.util.Random;

public class Dice_Roller_Program {
    static void main(String[] args) {
        /* Using bro codes notes:
         * Declare variables
         * Get number of dice the user wants to roll
         * Check if the number of dice is > 0 (greater than 0)
         * Roll all the die
         * Get the sum of all the die rolled
         */

        int userDiceRollsChoice;
        int total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("+====================+");
        System.out.println("|        Menu        |");
        System.out.println("+====================+");
        System.out.println("| How many die would |");
        System.out.println("|  you like to roll? |");
        System.out.println("+--------------------+");

        userDiceRollsChoice = scanner.nextInt();

        if(userDiceRollsChoice <= 0){
            System.out.println("Invalid number. Please try again!");
        } else{
            System.out.println("Rolling dice...");
        }

        while(userDiceRollsChoice > 0){ // > greater than | < less than
            System.out.println(diceRoll(userDiceRollsChoice, total));
            userDiceRollsChoice--; //decrement operator, post decrement uses the value then subtracts, pre decrement --x subtracts then uses the value
        }
        System.out.println("You have successfully completed your rolls!");
        //System.out.printf("The total is %d", total);



    }

    static int diceRoll(int userDiceRollsChoice, int total){

        int systemDiceRoll;

        Random random = new Random();
        systemDiceRoll = random.nextInt(1, 6);

        if(systemDiceRoll == 1){
            System.out.println("┌───────┐\n" +
                    "│       │\n" +
                    "│   ●   │\n" +
                    "│       │\n" +
                    "└───────┘");
            total += 1;

            systemDiceRoll--;

        } else if(systemDiceRoll == 2){
            System.out.println("┌───────┐\n" +
                    "│ ●     │\n" +
                    "│       │\n" +
                    "│     ● │\n" +
                    "└───────┘");
            total += 2;

            systemDiceRoll--;

        } else if(systemDiceRoll == 3){
            System.out.println("┌───────┐\n" +
                    "│ ●     │\n" +
                    "│   ●   │\n" +
                    "│     ● │\n" +
                    "└───────┘");
            total += 3;
            systemDiceRoll--;

        } else if(systemDiceRoll == 4){
            System.out.println("┌───────┐\n" +
                    "│ ●   ● │\n" +
                    "│       │\n" +
                    "│ ●   ● │\n" +
                    "└───────┘");
            total += 4;
            systemDiceRoll--;

        } else if(systemDiceRoll == 5){
            System.out.println("┌───────┐\n" +
                    "│ ●   ● │\n" +
                    "│   ●   │\n" +
                    "│ ●   ● │\n" +
                    "└───────┘");
            total += 5;
            systemDiceRoll--;

        } else{
            System.out.println("Something went wrong, please try again!");
        }

        return 0; // temporarily 0 until I am able to return the value I want

    }


}
