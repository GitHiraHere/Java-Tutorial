package basics;

public class For_Loops {
    static void main(String[] args) throws InterruptedException {
        // repeats code a certain amount of times

        int start = 10;

        for(int i = start; i > 0; i--){ //3 statements seperated by ; statement 1 (initialisation) statement 2(integer, when we want to stop), step (we can increment/decrement the counter)
            System.out.println(i);
            Thread.sleep(1000); //using the thread class we use the sleep method and pass the object 1000 ms
            //using this java requires we use interruptedexception, it happens when a thread running the method is interrupted while its sleeping, waiting or paused whilst running
        }

        System.out.println("HAPPY NEW YEAR");
    }
}
