package basics;

import java.util.Scanner;

public class User_Input_Arrays {

    static void main(String[] args) {
        String[] Foods = {"pizza", "taco", "hamburger"}; //fixed size, cannot change the length

        String[] foods = new String[3]; //empty array with space for three values that we can add, cannot do this with the array above

        foods[0] = "pizza";
        foods[1] = "taco";
        foods[2] = "hamburger";

        for(String food : foods){ //food is the element we iterate through, foods is the array itself
            System.out.println(food); //print out the element
        }
    }

}
