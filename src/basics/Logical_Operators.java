package basics;
import java.util.Scanner;

public class Logical_Operators {
    public static void main(String[] args) {
        // && = And || = or ! = NOT

        double temp = 30;
        boolean isSunny = false;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is good :D");
        } else if(temp <= 30 || temp >= 0 && !isSunny){  //is temp less than or equal to 30 is temp greater than/equal to 0 and is not sunny
            System.out.println("It is cloudy outside D:");
        }
        else{
            System.out.println("The weather is not good :(");
        }

        Scanner scanner = new Scanner(System.in);
        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        String username;

        System.out.print("Please enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12) { //if username is greater than/equal to 4 and less than/equal to 12 INCORRECT had to use the or operator
            System.out.println("Username does not pass the requirements.");
        } else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores");
        }
        else{
            System.out.println("Username passes the requirements!");
        }

        scanner.close();
    }
}
