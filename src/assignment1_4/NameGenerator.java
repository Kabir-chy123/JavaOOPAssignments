package assignment1_4;


import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstNames = {"Ram", "Hari", "Sita", "Gita"};
        String[] lastNames = {"Sharma", "Yadav", "Thapa", "Rai"};

        System.out.println("How many names?");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            int first = (int) (Math.random() * firstNames.length);
            int last = (int) (Math.random() * lastNames.length);

            System.out.println(firstNames[first] + " " + lastNames[last]);
        }
    }
}

