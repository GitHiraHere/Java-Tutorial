package basics;
import java.util.Scanner;

public class While_Loops {
    // while loop repeats the same code infinitely whilst a condition remains true

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        while(name.isEmpty()){
            System.out.println("Please try again...");
            System.out.println("Please enter your name: ");
            name = scanner.nextLine();
        }

        if(!name.isEmpty()){
            System.out.println("Hello " + name + "!");
        }

    }

}
