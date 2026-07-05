package basics;
import java.util.Scanner;

public class While_Loops {
    // while loop repeats the same code infinitely whilst a condition remains true

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        while(name.isEmpty()){
            System.out.println("Please try again...");
            System.out.println("Please enter your name: ");
            name = scanner.nextLine();
        }

        if(!name.isEmpty()){
            System.out.println("Hello " + name + "!");
        }

        //a variation of a while loop is a do while loop
        //you do some code first before checking a condition compared to a while loop where you may skip the code
        //entirely if the condition is false

        int age = 0;

        do{
            System.out.println("Your age cannot be a negative!");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }while(age < 0);

        System.out.println("You are " + age + " years old!");
        scanner.close();
        }

    }
