package basics;

public class Variable_Arguments {
    static void main(String[] args) {
        //variable arguments allow a method to accept a varying number of arguments
        //makes methods more flexible, so, no need for overloaded methods (same name but different parameters)
        //java puts the arguments into an array
        System.out.println(add(1,2,3,4)); //you can even have 0 arguments

        System.out.println(average(11,54,74,75)); //I can add as many arguments as I want and do not need to add as parameters to the method being called
    }

    static int add(int... numbers){
        int sum = 0;
        if(numbers.length == 0){
            System.out.println("The are no arguments!");
        }
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }

    static double average(double... averageNumbers){
        double sum = 0;

        for(double number : averageNumbers){
            sum += number;
        }
        return sum / averageNumbers.length;
    }
}
