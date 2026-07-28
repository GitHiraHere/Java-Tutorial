package projects;

public class Quiz_Game {
    static void main(String[] args) {
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



    }
}
