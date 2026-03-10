package basics;

public class Arithmetic_Operators {
    public static void main(String[] args) {

        int x = 10;
        int y = 2;
        //int z;

        //z = x + y;
        //z = x - y;
        //z = x * y;
        //z = x / y;
        //z = x % y; 10 divides by 2 evenly, so the remainder will be 0
        // the modulus operator is used when determining if a number is odd/even
        // or when working time, and we need to see if something is divisble by 60 seconds or minutes
        //System.out.println(z);

        // Augmented Assignment Operators
        // this time we want to add x + y but store the result in x

        //x = x + y;
        // we can simplify this step with the following
        //x += y;
        //x -= y;
        //x *= y;
        //x /= y; as we are using integer division, the decimal portion is truncated
        //x %= y;

        // Increment and Decrement Operators
        // commonly used with loops we can shorten x = x + 1 or x += 1 to the following if incrementing/decrementing by 1

        x++;
        x--;
        System.out.println(x);

        // Order of operations [P-E-M-D-A-S]
        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println(result);
    }
}
