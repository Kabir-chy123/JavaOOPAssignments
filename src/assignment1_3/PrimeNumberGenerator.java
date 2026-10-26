package assignment1_3;


import java.util.Scanner;

public class PrimeNumberGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start:");
        int start = scanner.nextInt();

        System.out.println("Enter end:");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            boolean prime = true;

            if (i < 2) {
                prime = false;
            }

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(i);
            }
        }
    }
}

