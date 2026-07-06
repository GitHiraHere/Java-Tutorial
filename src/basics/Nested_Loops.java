package basics;

public class Nested_Loops {
    static void main(String[] args) {
        //loop inside of a loop, usually used in matricies and data structures and algorithms


        //instead of printing this seperately we can use a nested loop to repeat the function

        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 9; j++){
                System.out.println(j + " ");
            }
        }

    }
}
