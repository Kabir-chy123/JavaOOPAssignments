
package assignment5_1;

import java.util.Random;

public class ParallelSum {

    public static void main(String[] args) {

        // Create an array of 100000 random numbers
        int[] numbers = new int[100000];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        // Find the number of processor cores
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of processor cores: " + cores);

        // Create threads and store their sums
        Thread[] threads = new Thread[cores];
        long[] sums = new long[cores];

        int partSize = numbers.length / cores;

        for (int i = 0; i < cores; i++) {

            final int threadNumber = i;
            int start = i * partSize;
            int end = (i == cores - 1) ? numbers.length : start + partSize;

            threads[i] = new Thread(() -> {

                long sum = 0;

                for (int j = start; j < end; j++) {
                    sum += numbers[j];
                }

                sums[threadNumber] = sum;
            });

            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < cores; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
                Thread.currentThread().interrupt();
                return;
            }
        }

        // Add the results from all threads
        long totalSum = 0;

        for (int i = 0; i < cores; i++) {
            totalSum += sums[i];
        }

        System.out.println("Total sum: " + totalSum);
        System.out.println("Calculation complete.");
    }
}
