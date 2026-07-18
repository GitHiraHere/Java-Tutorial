package basics;

import java.util.Arrays;

public class Arrayss { //cant import arrays and have the same name so had to add an extra s
    static void main(String[] args) {
        //a collection of  values of the same data type, essentially, a variable that can store multiple values

        String fruits = "apple"; //string
        String[] Fruits = {"apple", "orange", "banana", "strawberry"}; //array
        //arrays are a reference data type, so I cannot just print the variable Fruit
        //I would have to give an index
        System.out.println(Fruits[0]);

        //we can also change the value at a given index
        Fruits[0] = "pineapple";
        System.out.println(Fruits[0]);

        //if we need the length of an array
        int numOfFruits = Fruits.length; //fruits . (access modifier - aka access the length property) length of fruit
        System.out.println(numOfFruits);

        //if we want to print all elements of an array
        for(int i = 0; i < Fruits.length; i++) { // > greater than | < less than
            System.out.print(Fruits[i] + " "); //prints all the elements on the same line with spaces between them
        }

        System.out.println("\n");

        //enhanced for loop - simplifies listing an array
        for(String fruit : Fruits){ //fruit is the current element we are cycling through, Fruits is the array
            System.out.println(fruit); //for every fruit in my array, do x
        }

        System.out.println("\n");

        //built in sort method for arrays - sorts alphabetically
        Arrays.sort(Fruits); //prints the memory address if I try print the array directly, looks like: [Ljava.lang.String;@27716f4
        for(String fruit : Fruits){
            System.out.println(fruit);
        }

        System.out.println("\n");

        //we can also use a fill method with a given value
        Arrays.fill(Fruits, "tomato");

        //using an enhanced loop/for each loop to print each element
        for(String fruit : Fruits){
            System.out.println(fruit);
        }

    }
}
