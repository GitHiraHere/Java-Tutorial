package basics;
import java.util.Scanner;

public class Enhanced_Switches {
    public static void main(String[] args) {
        //Enhanced switch =  a replacement to many else if statements, a java 14 feature

        Scanner scanner = new Scanner(System.in);

        String day;

        System.out.print("What day is it?: ");
        day = scanner.nextLine(); // accept users input and save it into variable day
        day = day.toUpperCase(); // using string method to prevent case sensitivity

        //https://medium.com/@brunozambiazi/enhanced-switch-statements-in-java-17-31f3487763a0
        switch(day){
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> // arrow operator is like if this then -> (do this)
                System.out.println("It is a weekday!");
            case "SATURDAY", "SUNDAY" ->
                    System.out.println("It is a weekend!");
            default -> System.out.println(day + " is not a day!");
        }

        scanner.close();
    }
}
