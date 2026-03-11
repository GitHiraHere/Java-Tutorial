package basics;
import java.util.Scanner;

public class Substrings{
    public static void main(String[] args) {
        // .substring() = a built in method used to extract a portion of a string
        // .substring(start, end)

        String email = "Bro123@gmail.com";
        String username = email.substring(0, 6); // we take the original string, the substring method, then give 2 indexes, second index is exclusive
        String domain = email.substring(7, 16); // if you want everything after the starting index you do not have to define the ending index

        System.out.println(username);
        System.out.println(domain);

        // The problem with the above code is if the email has a different length it does not work
        // to make it more flexible so we dont have to manually change the indices, using the indexOf method

        String email2 = "BroCode1@gmail.com";
        String user2 = email2.substring(0, email2.indexOf("@"));

        //String domain2 = email2.substring(email2.indexOf("@")); this includes the @ symbol in output, we can remove that by doing + 1
        String domain2 = email2.substring(email2.indexOf("@") + 1);

        System.out.println(user2);
        System.out.println(domain2);

        // Exercise to accept user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String emailInput = scanner.nextLine().trim(); // .trim to remove any whitespace
        int length = emailInput.length();

        // Checking if the input is valid, using the string methods learnt from the class before
        if(emailInput.isEmpty()){
            System.out.println("Invalid email");
            return;
        } else if(emailInput.equals(" ")){
            System.out.println("Invalid email");
        } else if(length == 20){
            System.out.println("Email is too long >:C");
            return;
        } else{
            System.out.println("Something went wrong D:");
        }

        // Bro code used an if statement with .contains(@) whereas my code just ran after the previous if statement
        // I prefer his logic so the following if statement is not my idea but the written code is
        if(emailInput.contains("@")){
            System.out.println("Creating a username for you...");
            String usernameInput = emailInput.substring(0, email.indexOf("@") + 1);

            System.out.println("Username: " + usernameInput);
        } else{
            System.out.println("Emails must contain the @ character");
        }

        scanner.close();
    }
}
