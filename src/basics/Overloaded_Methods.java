package basics;

public class Overloaded_Methods {
    static void main(String[] args) {
        //methods that share the same name but have different parameters
        //method name and parameters give you a unique method signature
        //two methods cannot share the same signature but can have the same name

        System.out.println(add(1, 2));
        System.out.println(add(1,2,3));
    }
    static double add(double a, double b){ //adds two numbers together
        return a + b;
    }
    static double add(double a, double b, double c){ //adds three numbers together
        return a + b + c;
    }
}
