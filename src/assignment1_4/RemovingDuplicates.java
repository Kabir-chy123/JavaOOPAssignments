package assignment1_4;


import java.util.Scanner;

public class RemovingDuplicates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter number:");
            numbers[i] = scanner.nextInt();
        }

        int[] unique = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (numbers[i] == unique[j]) {
                    found = true;
                    break;
                }
            }

            if (found == false) {
                unique[count] = numbers[i];
                count++;
            }
        }

        System.out.println("Array without duplicates:");

        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
