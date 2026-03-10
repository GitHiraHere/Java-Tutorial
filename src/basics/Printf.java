package basics;

public class Printf {
    public static void main(String[] args) {
        // Printf is used to format the output

        //%[flags][.width][.precision][specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        // So I want to insert name, we use % as a placeholder
        // then a specifier character, what is the data type of the variable we are trying to insert, string is %s
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter); //with printf statements we need to manually put newlines
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        // you can insert multiple variables within the same line
        System.out.printf("%s is %d years old\n", name, age);

        // usually when printing a double it shows up to 6 digits after the decimal
        // when setting a precision we limit the amount of numbers displayed after a decimal
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%.1f\n", price1); // f for floating point number, this will automatically round the number
        System.out.printf("%.1f\n", price2);
        System.out.printf("%.3f\n", price3);

        /* [Flags]
            + = outputs a plus
            , = comma grouping separator i.e. 200,000
            ( = negative numbers are enclosed in ()
            space = display a minus if negative, space if positive
        */
        System.out.printf("%+.2f\n", price1); // f for floating point number, this will automatically round the number
        //System.out.printf("%,.2f\n", price2);
        System.out.printf("%(.3f\n", price3); // outputs (54.010)
        System.out.printf("% .2f\n", price2); // the space is good for aligning numbers

        /* [width]
            0 = zero padding
            number = right justified padding
            negative number = left justified padding
        */

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1); //if we just type 0 we get an error where it wants us to pad the numbers with 0, for the example we will use 4
        /* output with 04 for all 4 id's
        0001
        0023
        0456
        7890
        so to do padding, follow the placeholder (%) with 0 and then the amount of digits to pad 0 (4)
        */
        System.out.printf("%4d\n", id2); // removing the 0 simply just adds spaces
        System.out.printf("%-4d\n", id3); // we still have the spaces, they're just afterwards, for id3 we have one as its already 3 digits long
        System.out.printf("%-4d\n", id4); // no padding as it is already 4 digits

    }
}
