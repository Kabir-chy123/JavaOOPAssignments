package assignment1_2;
import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter first leg: ");
        double a = Double.parseDouble(reader.nextLine());

        System.out.print("Enter second leg: ");
        double b = Double.parseDouble(reader.nextLine());

        double c = Math.sqrt(a * a + b * b);

        System.out.println("Hypotenuse: " + c);

    }
}

