package assignmnet3_4;

import java.io.FileWriter;
import java.io.IOException;

public class FibonacciCSV {

    public static void main(String[] args) {

        long a = 0;
        long b = 1;

        try {
            FileWriter writer = new FileWriter("fibonacci.csv");

            for (int i = 0; i < 60; i++) {

                writer.write(a + "\n");
                System.out.println(a);

                long next = a + b;
                a = b;
                b = next;
            }

            writer.close();

            System.out.println("Fibonacci numbers saved successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

