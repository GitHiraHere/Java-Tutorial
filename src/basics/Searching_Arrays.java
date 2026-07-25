package basics;

public class Searching_Arrays {
    static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7, 10};
        int target = 4;
        String[] letters = {"a", "f", "c", "v"};
        String targetS = "c";
        boolean isFound = false;

        //using a linear search to iterate through the array looking for target
        //if using strings when using == the memory addresses are compared (are they at the same location, no)
        //as it is a reference data type so we have to use equals to compare the values

        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("Number element found at index: " + i);
                isFound = true;
                break; //once we find the target we can break out of the loop as we dont need to search through the rest of the array
            }
        }

        for(int i = 0; i < letters.length; i++){
            if(letters[i].equals(targetS)){ //passing target as the argument to equals method
                System.out.println("Letter element found at index: " + i);
                isFound = true;
                break; //once we find the target we can break out of the loop as we dont need to search through the rest of the array
            }
        }

        if(!isFound){
            System.out.println("Element not found in the array :(");
        }
    }
}
