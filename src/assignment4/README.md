
# Assignment 4 - Calculator

## Introduction

This is a simple Calculator program made using Java.
The program can add numbers, show the total, and
reset the total to zero.

## Source Code

```java
package assignment4;

public class Calculator {

    private int value = 0;

    // Reset the calculator to zero
    public void reset() {
        value = 0;
    }

    // Add a non-negative number
    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(
                "Negative numbers are not allowed"
            );
        }
        value += number;
    }

    // Return the current value
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(10);
        calculator.add(20);
        calculator.add(5);

        System.out.println("Total: "
                + calculator.getValue());

        calculator.reset();

        System.out.println("After reset: "
                + calculator.getValue());
    }
}
```

## Program Output

```text
Total: 35
After reset: 0
```

## How the Program Works

The Calculator class stores a number in a
variable called value.

### reset()

This method sets the total back to zero.

### add(int number)

This method adds a number to the current total.
If the number is negative, it throws an
IllegalArgumentException.

### getValue()

This method returns the current total.

## Using GitHub Copilot

I used GitHub Copilot Chat to understand
my Calculator.java program.

I asked Copilot to explain the reset(),
add(), and getValue() methods in simple English.

Copilot explained the methods with examples.
I used those explanations to understand how
the program works and wrote my own explanation.

## Advantages of GitHub Copilot

- It helps me understand Java code.
- It explains methods in simple language.
- It can save time while coding.
- It can suggest solutions when I get stuck.

## Disadvantages of GitHub Copilot

- Sometimes it can suggest incorrect code.
- I need to check its answers carefully.
- Using AI too much can affect my learning.

## Conclusion

In this assignment, I learned how a simple
Java Calculator class works.

I also learned how GitHub Copilot can help
me understand code and explain Java methods.

I think Copilot is useful for beginners,
but it is important to understand the code
instead of only copying AI suggestions.
