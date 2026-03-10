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

    }
}
