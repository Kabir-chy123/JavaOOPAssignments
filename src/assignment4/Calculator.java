
package assignment4;

public class Calculator {

    private int value = 0;

    public void reset() {
        value = 0;
    }

    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(
                    "Negative numbers are not allowed"
            );
        }
        value += number;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(10);
        calculator.add(20);
        calculator.add(5);

        System.out.println("Total: " + calculator.getValue());

        calculator.reset();

        System.out.println("After reset: " + calculator.getValue());
    }
}

