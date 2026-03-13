package projects;
import java.util.Scanner;

public class Temperature_Convertor {
    public static void main(String[] args) {
        /* This program is to get used to using the ternary operator 🔥
         *
         * Declare variables & Scanner
         * Menu including the fun secret option - was not possible through ternary operator D:
         * Ternary operator that sorts through choices
         * Notes: he took the number then asked the unit (two variables) and then used method chaining scanner.next.toUpperCase();
         * to assign a unit at the end, then he used his ternary operator as the condition
         * (unit.Equals("C)) ? : mathematical formula
         * numlock + alt + 0176 for the degrees symbol °
        */

        Scanner scanner = new Scanner(System.in);

        //Variables
        int choice;
        double numberToConvert;

        System.out.println("          Welcome!\n");
        System.out.println("       === MENU ===");
        System.out.println("1. Convert from F to C");
        System.out.println("2. Convert from C to F");

        System.out.print("\nPlease enter your choice: ");
        choice = scanner.nextInt();
        System.out.print("Enter the number you want to convert: ");
        numberToConvert = scanner.nextDouble();

        // Double result = (choice == 1) ? (numberToConvert - 32) / 1.8 : 0; So I could not figure out what to do the
        // second option as so I looked at his video into for the segment, the rest was done myself

        Double result = (choice == 1) ? (numberToConvert - 32) / 1.8 : (numberToConvert * 1.8) + 32;
        System.out.printf("%.2f", result);

        scanner.close();
    }
}
