package projects;
import java.util.Scanner;

public class Compound_Interest_Calculator {
    public void main(String[] args) {
        // Compound interest calculator - if you put money into a bank account, using a formula we can find the
        // final total after the balance and interest has been added together

        Scanner scanner = new Scanner(System.in);

        double principal; // stores the principal rate, what is the original investment
        double rate;
        int timesCompounded; // how often is interest compounds, yearly, quarterly etc.
        int years;
        double amount; // the final amount

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100; // if someone puts in 5% for example we want that as 0.5 for calculations so we / by 100

        System.out.print("Enter the # of times compounded per year: "); // yearly = 1 quarterly = 4 monthly = 12, typically it's 1 so that is what we will be using
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();
        // raise 1 + interest rate divided by times compounded
        // (we comma separate the base to power, the first part of the equation before , is the base)
        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        //System.out.println("The amount after " + years + " is: £" + amount);
        System.out.printf("The amount after %d years is £%.2f\n", years, amount);
        scanner.close();

    }
}
