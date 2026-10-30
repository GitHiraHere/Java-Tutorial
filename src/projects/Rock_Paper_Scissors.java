package projects;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        /* Bro codes method
         *
         * Declare variables
         * Get choice from the user
         * Get random choice for the computer
         * Check win conditions
         * Ask to play again
         * Goodbye message
         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes"; //default to yes

        do{ //Do all the code once, then check the condition at the end (while)

            System.out.print("Enter your move (Rock/Paper/Scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("Invalid choice!");
                continue; //if the user makes an invalid choice we skip the current iteration of this loop and go back to the beginning
            }

            computerChoice = choices[random.nextInt(3)]; //either 0, 1 or 2
            System.out.println("Computer choice: " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");

            } else if(playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                    playerChoice.equals("paper") && computerChoice.equals("rock") ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper")){
                System.out.println("You win!");

            } else{
                System.out.println("You lose!");
            }

            System.out.print("Play again?(yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while(playAgain.equals("yes"));

        System.out.println("Thanks for playing! :D");

        scanner.close();
    }
}
