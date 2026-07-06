package basics;

public class Methods {
    static void main(String[] args) {
        //method is a block of reusable code that is executed when called ()

        //happyBirthday(); another way to think of it is the () are a little telelphone calling the method
        //if we declare any variables in a method, they are not defined in another method, to get around this we can pass arguments to another method
        String name = "H";
        happyBirthday(name); //passing the variable name, we need a matching set of parameters

        double result = square(3);
        System.out.println(result);
        //also can be written as the following
        System.out.println(square(3));

    }

    static void happyBirthday(String name){ //the parameter name doesnt have to be the same but for consistency its good to keep it the same as the argument being passed
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", name);
        System.out.println("You are x years old!");
        System.out.println("Happy birthday to you!\n");
    }

    static double square(double number){ //as we are returning a value this method does not use void
        return number * number; //as we are calling an argument from a static method, this method also needs to be static
    }
}
