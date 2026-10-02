package projects;

import java.util.Scanner;

public class Quiz_Game {
    public static void main(String[] args) {
        /* creating an array of custom questions and then a 2d array of all the options for answers
        * the user will type in a number 1-4 depending on the guess
        * after all questions are answered we will display the users final score
        * His layout:
        * Questions array[] - DONE
        * Options array[][] - DONE
        * Declare variables
        * Welcome message
        * List each question using a loop
        *   List options
        *   Get guess from user
        *   Check if the guess is correct
        * Display final score
        */

        Scanner scanner = new Scanner(System.in);

        String[] Questions = {"What is the oldest rainforest in the world?",
                "What is the atomic number of Californium?",
                "In which US state is it illegal to ride a horse over 10 mph?",
                "What city is home to Amazon.com's headquarters?",
                "What object marks the geographic South Pole?"};
        //Daintree rainforest, 98, Indiana, Seattle, A plaque

        String[][] Options = {{"1. Amazon Rainforest", "2. Black Forest", "3. Congo Rainforest", "4. Daintree Rainforest"},
                {"1. 96", "2. 98", "3. 100", "4. 92"}, {"1. Indiana", "2. Texas", "3. Montana", "4. Wyoming"},
                {"1. San Francisco", "2. Seattle", "3. New York City", "4. Austin"},
                {"1. A flag", "2. A plaque", "3. A banner", "A pole"}};

        char userInput = 'T';

        while((userInput == 'T')){
            System.out.println("=== MENU ===");
            System.out.println("\nA. Start guessing!");
            System.out.println("\nB. Exit");

            System.out.print("\nPlease enter your option: ");
            userInput = scanner.next().charAt(0); //next method gives a string, then we method chain charAt method for the first char

            if(userInput == 'B'){
                System.out.println("\nExiting system... Goodbye!");
                return;
            }else if(userInput == 'A'){
                System.out.println("\nContinuing onto questions!");
            }else{
                System.out.println("\nSomething went wrong! Please try again");
                userInput = 'T';
            }
        }

        /* Explaination on how this array works - Claude AI
          What .length means on a 2D array

Think of `Options` as a grid, but not a rectangular one — it's rows of different sizes, like a bookshelf where each shelf can hold a different number of books.**

Options[0]  -->  [ "1. Amazon...", "2. Black Forest...", "3. Congo...", "4. Daintree..." ]   <- 4 books on this shelf
Options[1]  -->  [ "1. 96", "2. 98", "3. 100", "4. 92" ]                                      <- 4 books on this shelf
Options[2]  -->  [ "1. Indiana", "2. Texas", "3. Montana", "4. Wyoming" ]                      <- 4 books on this shelf
Options[3]  -->  [ "1. San Francisco", "2. Seattle", "3. New York City", "4. Austin" ]         <- 4 books on this shelf
Options[4]  -->  [ "1. A flag", "2. A plaque", "3. A banner", "A pole" ]                        <- 4 books on this shelf

`Options` itself is the bookshelf — it has 5 shelves. So:

Options.length   // = 5  (how many SHELVES there are, i.e. how many rows/questions)

Each `Options[i]` is one shelf — an individual `String[]`. So:

Options[0].length   // = 4  (how many BOOKS are on shelf 0)
Options[1].length   // = 4  (how many BOOKS are on shelf 1)
Options[i].length   // = however many books are on shelf i


`Options.length` and `Options[i].length` answer two completely different questions. One tells you the number of rows. The other tells you the number of items *inside one specific row.

Now connect it to your loop. Your outer loop variable `i` is currently pointing at one specific question/row. When you write the inner loop, you want it to walk across just that shelf's books — not ask how many shelves exist. So instead of:

for(int j = 0; j < Options.length; j++){


you want the inner loop to stop based on how many items are in shelf `i` specifically. Using the vocabulary above — "how many books are on shelf `i`" — what would you write in place of `Options.length`?

Try it, and if you want to sanity-check yourself before running it: for `i = 4` (the last question), how many times should the inner loop run, and what should it print on each pass?
         */
        for(int i = 0; i < Questions.length; i++){
            System.out.println("Question: " + Questions[i]);
            for(int j = 0; j < Options[i].length; j++){
                System.out.println("Answer: " + Options[i][j]); //[i] is for the row num and [j] is the individual 4 options
            }
        }

    }
}
