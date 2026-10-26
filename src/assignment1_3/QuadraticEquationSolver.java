package assignment1_3;


import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a:");
        double a = scanner.nextDouble();

        System.out.println("Enter b:");
        double b = scanner.nextDouble();

        System.out.println("Enter c:");
        double c = scanner.nextDouble();

        double d = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Not a quadratic equation");
        } else if (d < 0) {
            System.out.println("No real roots");
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Root 1: " + x1);
            System.out.println("Root 2: " + x2);
        }
    }
}


