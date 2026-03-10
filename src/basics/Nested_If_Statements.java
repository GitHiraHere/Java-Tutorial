package basics;

public class Nested_If_Statements {
    public static void main(String[] args) {
        // it is possible to have if statements within if statements

        boolean isStudent = true;
        boolean isSenior = true; // 65 or older they get a student discount
        //if they are a student + senior they get a combined total of 30% off of their ticket price
        double price = 9.99;

        if(isStudent) {
            if (isSenior) { //nested if statement
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            }else{
                System.out.println("You get a student discount of 10%");
                price *= 0.9; //this gets you 10% 90%/100 = 0.9 and multiplying by 0.9 is faster, this sets the price to be 90%, 10% discount

            }
        }else{
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            }
            else{
                price *= 1; //does not do anything, just helps with visualisation, if they are not a student or senior they get no discount
            }
        }

        System.out.printf("The price of a ticket is: £%.2f", price);
    }
}
