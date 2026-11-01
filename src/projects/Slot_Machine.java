package projects;

import java.util.Random;
import java.util.Scanner;

public class Slot_Machine {
    public static void main(String[] args) {
        /* Bro codes method
         * Declare variables
         * Display welcome message
         * Play if balance > 0
         * Enter bet amount
         *      Verify if bet > balance
         *      Verify if bet > 0
         *      Subtract bet from balance
         * Spin row
         * Print row
         * Get payout
         * Ask to play again
         * Display exit message
         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int balance = 100;
        int bet;
        int number;
        int[] slotMachine = {};


        System.out.println("*************************");
        System.out.println("    Welcome to SLOTS!");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐");
        System.out.println("*************************");
        System.out.println("\nYour current balance is: $" + balance);

        System.out.print("Place your bet amount: ");
        bet = scanner.nextInt();

        if(bet <= 0) { //if bet is less than or equal to 0
            System.out.println("\nThe bet you placed was invalid, try again!");
        } else if(balance < bet){
            System.out.println("You do not have sufficient funds to place this bet, try again!");
        } else{
            System.out.println("Spinning...");
        }

        for(int i = 0; i < 3; i++){
            number = random.nextInt(0, 4); // using the random object we call the nextInt method and this generates a random number

            if(number == 0){
                System.out.print("🍒");

            } else if(number == 1){
                System.out.print("🍉");

            } else if(number == 2){
                System.out.print("🍋");

            } else if(number == 3) {
                System.out.print("🔔");

            } else if(number == 4) {
                System.out.print("⭐");

            }else{
                System.out.println("Something went wrong!");
            }
        }


        scanner.close();

    }
}
