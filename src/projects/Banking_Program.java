package projects;

import java.util.Scanner;

public class Banking_Program {

    /* Using bro codes notes:
    *  Declare variables - DONE
    *  Display menu - DONE
    *  Get and process user choice - DONE
    *  showBalance() - DONE
    *  deposit() - DONE
    *  withdraw() - DONE
    *  exit message - DONE
    *
    * note: he has a while loop so that so long as the user does not exit the program it keeps running, using a boolean isRunning variable
    * he also used an enhanced switch to deal with the choices rather than if else statements
    * as well as using print f statements instead of just print statements
    * he made his scanner in the main class (class scope) as he handled user inputs separately in each method and did not want to create multiple local scanners as they remain open
    * if I were to do this I need to make sure its static as static methods are using it
    * he also handled if people were trying to withdraw money and it'd cause the balance to become negative
    */

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double balance = 100;
        double depositChoice = 0;
        double withdrawChoice = 0;

        System.out.println("          Welcome!\n");
        System.out.println("       === MENU ===");
        System.out.println("1. View balance");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdraw money");
        System.out.println("4. Exit");

        System.out.print("\nPlease enter your choice: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Your balance is: " + viewBalance(balance));
        } else if(choice == 2){
            System.out.print("Enter how much you would like to deposit: ");
            depositChoice = scanner.nextDouble();
            System.out.println("Your balance is: " + deposit(balance, depositChoice));
        } else if(choice == 3){
            System.out.println("Enter how much you would like to withdraw: ");
            withdrawChoice = scanner.nextDouble();
            System.out.println("You have withdrawn " + withdrawChoice + " your balance is now: " + withdraw(balance, withdrawChoice));
        } else{
            System.out.println("You have successfully exited the system, good bye!");
        }

        scanner.close();
    }

    static double viewBalance(double balance){
        return balance;
    }

    static double deposit(double balance, double depositChoice){ //YOOO I DID IT!!!!
        balance += depositChoice;
        return balance;
    }

    static double withdraw(double balance, double withdrawChoice){ //not void as it needs to return something
        balance -= withdrawChoice;
        return balance;
    }
}
