package basics;

public class Break_And_Continue {
    static void main(String[] args) {
        //break = breaks out of a loop
        //continue = skips the current iteration of a loop

        for(int i = 0; i < 10; i++) { //whilst i is less than 10

            /*if(i == 5){
                break; //prints 0 1 2 3 4
            }*/

            if(i == 3){
                continue; //prints 0 1 2 4 5 6 7 8 9
            }

            System.out.println(i);
        }
    }
}
