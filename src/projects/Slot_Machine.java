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
         *
         * Notes:
         * https://www.geeksforgeeks.org/java/stringbuilder-append-method-in-java-with-examples/
         *
         * Bro code used a different method (Static) to spin the slots, it returns a string array, then he had another
         * array that had a limit of 3, using random it called 3 random symbols from the first array. This would increment
         * the second array, then he joined the three symbols using arrayName.Join. Then he compared the indexes (0,1,2)
         * to see if they matched using arrayName.equals and this would give them a point.
         * He also had a play again function
         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

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
            balance = balance - bet;
        }

        for(int i = 0; i < 3; i++){
            number = random.nextInt(0, 4); // using the random object we call the nextInt method and this generates a random number

            if(number == 0){
                System.out.print("🍒");
                sb.append("🍒");

            } else if(number == 1){
                System.out.print("🍉");
                sb.append("🍉");

            } else if(number == 2){
                System.out.print("🍋");
                sb.append("🍋");

            } else if(number == 3) {
                System.out.print("🔔");
                sb.append("🔔");

            } else if(number == 4) {
                System.out.print("⭐");
                sb.append("⭐");

            }else{
                System.out.println("Something went wrong!");
            }
        }

        if(sb.equals("🍒🍒🍒")){
            balance = bet + bet; //bet gets doubled and given back if they win
            System.out.println("You win! Your balance is now: " + balance);

        } else if(sb.equals("🍉🍉🍉")){
            balance = bet + bet;
            System.out.println("You win! Your balance is now: " + balance);

        } else if(sb.equals("🍋🍋🍋")){
            balance = bet + bet;
            System.out.println("You win! Your balance is now: " + balance);

        } else if(sb.equals("🔔🔔🔔")){
            balance = bet + bet;
            System.out.println("You win! Your balance is now: " + balance);

        } else if(sb.equals("⭐⭐⭐")){
            balance = bet + bet;
            System.out.println("You win! Your balance is now: " + balance);
        }

        scanner.close();

    }
}
