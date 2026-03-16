package basics;

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //(Scanner)Name of the class, (scanner) name of the object

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine(); // the next line method reads the string, including any spaces
        // if we dont want to read any inputted spaces we can use scanner.next();

        System.out.println("Hello " + name);

        System.out.print("What is your age?: ");
        int age = scanner.nextInt();

        System.out.println("You are " + age + " years old!");

        System.out.print("Are you a student?(true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("This is just to remind me you can take a char input: ");
        char reminderLol = scanner.next().charAt(0); //next method gives a string, then we method chain charAt method for the first char

        if (isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are not a student!");
        }

        /* there is a common issue where after a scanner.nextInt(); or scanner.nextDouble(); before scanner.nextLine();
           the enter (\n) is still in the input buffer, so the nextLine method picks up
           the newline character and uses it as an input

           to prevent this, after getting an input for an int/double use the nextLine method
           but do not assign it to anything, this will clear the buffer
        */

        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        double area = width * height;
        System.out.println("The area is: " + area + "cm²"); // numlock + alt + 0178 for the 2

        scanner.close(); // good practice to close the scanner to prevent random bugs
    }
}
