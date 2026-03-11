package projects;
import java.util.Scanner;
import java.util.Random;

public class Weight_Conversion_Program {
    public static void main(String[] args) {
        /* He recommended commenting what we want to do before creating a project, also known as pseudocode
         * Declare variables
         * Welcome message
         * Prompt for user input
         * option 1 convert lbs to kgs
         * option 2 convert kgs to lbs
         * else print not a valid choice
         *
         * Based on his pseudocode I will create this project myself then compare to how his solution
         * - Note from after creation, I may have deviated from the initial project idea...
         * difference was he used precise values... And also did not print ascii
         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Variables
        int choice; // stores user's choice from the main menu
        double lbsInput; // stores the user's lbs input
        double kgInput; // stores the user's kg input
        double result; // stores the final result
        int asciiArt;
        System.out.println("          Welcome!\n");
        System.out.println("       === MENU ===");
        System.out.println("1. Convert from lbs to kgs");
        System.out.println("2. Convert from kgs to lbs");
        System.out.println("3. Exit");
        System.out.println("\n4. Secret fourth option");

        System.out.print("\nPlease enter your choice: ");
        choice = scanner.nextInt();

        switch (choice) { // https://medium.com/@brunozambiazi/enhanced-switch-statements-in-java-17-31f3487763a0
            case 1:
                System.out.print("Enter the lbs: ");
                lbsInput = scanner.nextDouble();

                result = lbsInput / 2.205; // To get an approx result / by 2.205
                System.out.printf("%.2f\n", result); //%[flags][.width][.precision][specifier-character] wanted to right pad and limit to 2 decimal place, do not think that is possible D:
                return;
            case 2:
                System.out.print("Enter the kg: ");
                kgInput = scanner.nextDouble();

                result = kgInput * 2.205; // To get an approx result * by 2.205
                System.out.printf("%.2f\n", result);
                return;
            case 3:
                System.out.println("Exiting system...");
                return;
            case 4:
                asciiArt = random.nextInt(0, 3); // remember that the second number is exclusive and not included
                if(asciiArt == 0) {
                    System.out.println(
                                    "´´´´¶¶¶¶¶¶´´´´´´¶¶¶¶¶¶\n" +
                                    "´´¶¶¶¶¶¶¶¶¶¶´´¶¶¶¶¶¶¶¶¶¶\n" +
                                    "´¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                                    "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                                    "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                                    "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶`\n" +
                                    "´´¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                                    "´´´´´¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                                    "´´´´´´´¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                                    "´´´´´´´´´¶¶¶¶¶¶¶¶\n" +
                                    "´´´´´´´´´´´¶¶¶¶\n");
                    return;
                } else if (asciiArt == 1) { //https://www.textartcopy.com/
                    System.out.println(
                                    "────────────────────────────────\n" +
                                    "───────────────██████████───────\n" +
                                    "──────────────████████████──────\n" +
                                    "──────────────██────────██──────\n" +
                                    "──────────────██▄▄▄▄▄▄▄▄▄█──────\n" +
                                    "──────────────██▀███─███▀█────── \n" +
                                    "█─────────────▀█────────█▀──────\n" +
                                    "██──────────────────█───────────\n" +
                                    "─█──────────────██──────────────\n" +
                                    "█▄────────────████─██──████\n" +
                                    "─▄███████████████──██──██████ ──\n" +
                                    "────█████████████──██──█████████\n" +
                                    "─────────────████──██─█████──███\n" +
                                    "──────────────███──██─█████──███\n" +
                                    "──────────────███─────█████████\n" +
                                    "──────────────██─────████████▀\n" +
                                    "────────────────██████████\n" +
                                    "────────────────██████████\n" +
                                    "─────────────────████████\n" +
                                    "──────────────────██████████▄▄\n" +
                                    "────────────────────█████████▀\n" +
                                    "─────────────────────████──███\n" +
                                    "────────────────────▄████▄──██\n" +
                                    "────────────────────██████───▀\n" +
                                    "────────────────────▀▄▄▄▄▀");
                    return;
                } else if (asciiArt == 2){ //https://user.xmission.com/~emailbox/ascii_cats.htm
                    System.out.println(
                            "             *     ,MMM8&&&.            *\n" +
                            "                  MMMM88&&&&&    .\n" +
                            "                 MMMM88&&&&&&&\n" +
                            "     *           MMM88&&&&&&&&\n" +
                            "                 MMM88&&&&&&&&\n" +
                            "                 'MMM88&&&&&&'\n" +
                            "                   'MMM8&&&'      *\n" +
                            "          |\\___/|\n" +
                            "          )     (             .              '\n" +
                            "         =\\     /=\n" +
                            "           )===(       *\n" +
                            "          /     \\\n" +
                            "          |     |\n" +
                            "         /       \\\n" +
                            "         \\       /\n" +
                            "  _/\\_/\\_/\\__  _/_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_\n" +
                            "  |  |  |  |( (  |  |  |  |  |  |  |  |  |  |\n" +
                            "  |  |  |  | ) ) |  |  |  |  |  |  |  |  |  |\n" +
                            "  |  |  |  |(_(  |  |  |  |  |  |  |  |  |  |\n" +
                            "  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |\n" +
                            "  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |");
                    return;
                } else {
                    System.out.println("Something went wrong (┬┬﹏┬┬)");
                }
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
