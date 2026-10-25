
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = Double.parseDouble(reader.nextLine());

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Temperature in Celsius: %.1f", celsius);

    }
}

