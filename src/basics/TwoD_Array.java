package basics;

public class TwoD_Array {
    //2D array is an array where each element is an array
    //useful for storing a matrix of data

    static void main(String[] args) {
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        //we can combine the above array into a 2d array

        String[][] groceries = {fruits, vegetables, meats}; //can also just paste the elements of each array
        //looks like the following
        // String[][] groceries = {{},{},{}}'

        //if you ever want to access an element you need to use two indices [][]
        //first one is the row second is the column
        groceries[1][2 ] = "pineapple";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println(); //newline character after each array
        }
    }
}
