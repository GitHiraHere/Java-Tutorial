package basics;

public class Variable_Scope {
    //class variables are good if you need a variable that has to be a constant or in oop
    static int x = 3; //CLASS variable - variable x within the class of Variable_Scope is a local variable
    //a way to view this is this x is out on the street and the other two classes are houses looking out of their window to see it

    static void main(String[] args) {
        //variable scope is where a variable can be accessed
        //if you define a variable within the method that's considered a local scope

        int x = 1; //LOCAL variable
        System.out.println(x);

        doSomething();

        //outside of this method if a variable is defined, this method will not recognise it
        //so we have to pass this method that variable for it to recognise this, that is class variable
    }
    static void doSomething(){ //wont return anything so its void
        int x = 2; //LOCAL variable
        System.out.println(x);
    }
    //java uses local variables before class variables so it prints 1 and 2 rather than 3
}
