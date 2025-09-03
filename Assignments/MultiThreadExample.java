// Write a java program that implements a multi-thread application that has different threads. The first thread generates a random integer every 1 second and if the value is even, the second thread computes the square of the number and prints. If the value is odd, the thread will print the value of the number.
//      Definition of Done:

// Create threads either by extending Thread class or by implementing Runnable interface
// Use random() for generating random integer numbers
// Put the thread logic inside run()
// Show the desired output

import java.util.Random;    
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class MultiThreadExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Random random = new Random();

        Runnable numberGenerator = () -> {
            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100); // Generate random number between 0 and 99
                System.out.println("Generated number: " + number);
                if (number % 2 == 0) {
                    executor.submit(new SquareCalculator(number));
                } else {
                    System.out.println("Odd number, not calculating square: " + number);
                }
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Number generator interrupted.");
                }
            }
            executor.shutdown();
        };

        executor.submit(numberGenerator);
    }
}

    class SquareCalculator implements Runnable {
        private final int number;

        public SquareCalculator(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            int square = number * number;
            System.out.println("Square of " + number + " is: " + square);
        }
    }


    
