package assignment1_2;
import java.util.Scanner;

public class ObsoleteMeasures {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Weight (g): ");
        double grams = Double.parseDouble(reader.nextLine());

        double totalLuoti = grams / 13.28;

        int leiviska = (int) (totalLuoti / 640);

        double remaining = totalLuoti % 640;

        int naula = (int) (remaining / 32);

        double luoti = remaining % 32;

        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.%n",
                grams, leiviska, naula, luoti);

    }
}

