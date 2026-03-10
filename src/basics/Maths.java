package basics;

import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {

        System.out.println(Math.PI); // built in pi value, so we dont need to manually type in 3.14 we would just do 2 * Math.PI for example
        System.out.println(Math.E); // exponential constant aka Euler's constant (a mathematical constant approximately equal to 0.57721)

        double result;

        result = Math.pow(2, 5); //2 to the power of 5, they can be values or variables
        result = Math.abs(-5); // what is the absolute value of -5 (how far away is it from 0), this would be +5, it returns the positive of itself if the number is negative
        result = Math.sqrt(9); // square root of 9 is 3
        result = Math.round(3.14); // rounds to the nearest whole integer
        result = Math.ceil(3.14); // always rounds up
        result = Math.floor(3.14); // always rounds down
        result = Math.max(10, 20); // what is the max between these two values/variables
        result = Math.min(10, 20); // what is the min between these two values/variables
        System.out.println(result);

        // PRACTICE
        // HYPOTENUSE c = Math.sqrt(a² + b²) windows + alt + numlock + 0178

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();
        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c =  Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); //we have to raise a/b to the power of 2 before finding the sqrt, we do this within the sqrt method

        //System.out.println("The hypotenuse (side c) is: " + c + "cm");
        System.out.printf("The hypotenuse (side c) is: %.2fcm", c); //truncates to a max of 2 decimal numbers

        scanner.close();
    }
}
