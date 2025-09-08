/* Write a program called Hellojava that creates a thread (let's call it Thread 1). Thread 1 creates another thread (Thread 2); Thread 2 creates Thread 3; and so on, up to Thread 50.

Each thread should print "Hello from Thread <num>!", but you should structure your program such that the threads print their greetings in reverse order.

Definition of Done:

Create thread either by extending Thread class or implementing Runnable interface
Inside run() perform the desired operations
Show the desired output */

import java.util.*;
class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of threads to create (up to 50): ");
        int n = sc.nextInt();
        if (n < 1 || n > 50) {
            System.out.println("Please enter a number between 1 and 50.");
            return;
        }
        createThread(n);
        sc.close();
    }

    public static void createThread(int num) {
        if (num == 0) {
            return;
        }
        Thread thread = new Thread(() -> {
            createThread(num - 1);
            System.out.println("Hello from Thread " + num + "!");
        });
        thread.start();
        try {
            thread.join(); // Ensure the current thread waits for this thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}