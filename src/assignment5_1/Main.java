
package assignment5_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();

        Thread oddThread = new Thread(() -> {
            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd Thread: " + i);
                }
            }
        });

        Thread evenThread = new Thread(() -> {
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even Thread: " + i);
                }
            }
        });

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            Thread.currentThread().interrupt();
        }

        System.out.println("Printing complete.");

        scanner.close();
    }
}
