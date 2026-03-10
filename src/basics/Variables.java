package basics;

public class Variables {
    public static void main(String[] args) {

        /*
            A variable is a reusable container for a value, it behaves as the containing value

           Primitive = simple value stored directly in memory (stack)
           Reference = memory address (stack) that points to the (heap)
           For example, a primitive is like being given 10 pounds
           whereas a reference is giving an IOU for 10 pounds

            Primitive vs Reference
            int          string
            double       array
            char         object
            boolean

            To declare a variable
            1. Declaration - what we want to store the information in
            2. Assignment - giving the declared variable information
         */

        int age = 500;
        double price = 3.14;
        char letter = '$';
        boolean isStudent = true;
        String name = "A name!";

        System.out.println(letter + price);
        if (isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are not a student!");
        }

        System.out.println("Hello " + name + "!");

    }
}
