// Write a program, which can run two-thread simultaneously. One thread will calculate the factorial of a number and another thread will calculate the factors of that number. Also, make sure main thread finishes last.

//    Definition of Done:

// Create threads either by extending Thread class or by implementing Runnable interface
// Inside run() perform the desired operations
// Use join() to ensure that main thread finishes last

import java.util.Scanner;
public class FactorialAndFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        Thread factorialThread = new Thread(new FactorialCalculator(number));
        Thread factorsThread = new Thread(new FactorsCalculator(number));

        factorialThread.start();
        factorsThread.start();

        try {
            factorialThread.join();
            factorsThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread finished execution.");
    }
}
class FactorialCalculator implements Runnable {
    private final int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
class FactorsCalculator implements Runnable {
    private final int number;

    public FactorsCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
