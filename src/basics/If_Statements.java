package basics;
import java.util.Scanner;

public class If_Statements {
    public static void main(String[] args) {
        // if statement = performs a block of code if its condition is true

        //int age = 25;
        int age;
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine(); //if the user simply presses the enter key they can skip this field, to prevent this we use the .isEmpty() method

        if(name.isEmpty()){ //isEmpty gives a boolean of true or false
            System.out.println("You did not enter your name!");
        } else{
            System.out.println("Hello " + name);
        }
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        // if age is greater than or equal to 18
        if(age >= 18){
            System.out.println("You are an adult!");
        }
        else if(age >= 65){ // if statements are read line by line, as the first line fills the criteria, this line is skipped, positioning of if statements is key
            System.out.println("You are a senior!");
        }
        else if(age < 0){ //if age is less than 0
            System.out.println("You have not been born yet!");
        }
        else if (age == 0){ //double = sign is the comparison operator whereas the single = is an assignment operator
            System.out.println("You are a baby!");
        }
        else { //the default code if the above statements are false
            System.out.println("You are a child!");
        }

        scanner.close();
    }
}
