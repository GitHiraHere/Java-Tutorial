package basics;

public class String_Methods {
    public static void main(String[] args) {

        String name = "Bro Code";

        int length = name.length(); // to access the length method you need a string . method (length method)
        System.out.println(length); // 8, this can be useful if measuring how many characters are in a password

        char letter = name.charAt(0); // char at retrieves the character at a specified index
        System.out.println(letter);

        int index = name.indexOf(" "); // 3, index of tells us where the first occurrence of a letter is
        int index1 = name.lastIndexOf("O"); // 5, what is the last index of O

        name = name.toUpperCase();
        name = name.toLowerCase();

        name = name.trim(); // removes any whitespace after a character
        name = name.replace("B", "A"); // replace a character

        // There are also string methods that return boolean
        System.out.println(name.isEmpty()); // can be useful in an if statement

        if(name.equals("password")){ // if our name has the exact same as the string password
            System.out.println("Your name cannot be password"); // it prints this
        }
        else{
            System.out.println("Hello " + name);
        }

        // .equals does not account for case sensitivity, to fix this, we can use .ignoreCase
        name.equalsIgnoreCase("bro code");
    }
}
