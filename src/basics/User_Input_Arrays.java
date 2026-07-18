package basics;

import java.util.Scanner;

public class User_Input_Arrays {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] Foods = {"pizza", "taco", "hamburger"}; //fixed size, cannot change the length

        for(String food : Foods){ //food is the element we iterate through, foods is the array itself
            System.out.println(food); //print out the element
        }


        String[] foods = new String[3]; //empty array with space for three values that we can add, cannot do this with the array above

        /*foods[0] = "pizza";
        foods[1] = "taco";
        foods[2] = "hamburger";
        */

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food item: ");
            foods[i] = scanner.nextLine(); //i changes with every iteration
        }

        for(String food : foods){ //food is the element we iterate through, foods is the array itself
            System.out.println(food); //print out the element
        }

        //we can also allow the user to determine the array length
        String[] foodz;
        int size;

        System.out.print("How many food items would you like?: ");
        size = scanner.nextInt();

        scanner.nextLine(); //because we accept an integer in our scanner followed by a string we need a buffer to pick up the newline character

        foodz = new String[size];
        for(int i = 0; i < foodz.length; i++){
            System.out.print("Enter a food item: ");
            foodz[i] = scanner.nextLine(); //i changes with every iteration
        }

        for(String Foodz : foodz){ //food is the element we iterate through, foods is the array itself
            System.out.println(Foodz); //print out the element
        }


        scanner.close();
    }

}
