package projects;

import java.util.Scanner;
import java.util.Random;

public class Dice_Roller_Program {

    static int total = 0;

    static void main(String[] args) {
        /* Using bro codes notes:
         * Declare variables - DONE
         * Get number of dice the user wants to roll - DONE
         * Check if the number of dice is > 0 (greater than 0) - DONE
         * Roll all the die - DONE
         * Get the sum of all the die rolled - DONE
         *
         * Notes:
         * he uses a for loop to iterate until the number of dice is equal to 0, he also generates a random number,
         * to get his total he adds the variable that holds the random number generated, this is all done in one method
         * he has a separate method to print the dice art assigns each to a variable i.e. dice1, dice2 and then uses a switch case
         * to print the corresponding ascii art needed
         */

        int userDiceRollsChoice;


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
            System.out.println(diceRoll(userDiceRollsChoice));
            userDiceRollsChoice--; //decrement operator, post decrement uses the value then subtracts, pre decrement --x subtracts then uses the value
        }

        System.out.println("\nYou have successfully completed your rolls!");

    }

    static int diceRoll(int userDiceRollsChoice){

        int systemDiceRoll;
        //int total; causing issues if I do not initialise, so going to make this a class variable

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

        System.out.println("Your total is now: ");
        return total;

    }


}
