package assignment1_3;


import java.util.Scanner;

public class MultiplicationTableExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int score;

        do {
            score = 0;

            for (int i = 1; i <= 10; i++) {

                int a = (int) (Math.random() * 10) + 1;
                int b = (int) (Math.random() * 10) + 1;

                System.out.println(a + " x " + b + " = ?");
                int answer = scanner.nextInt();

                if (answer == a * b) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong!");
                }
            }

            System.out.println("Your score: " + score);

            if (score < 10) {
                System.out.println("Try again!");
            }

        } while (score < 10);

        System.out.println("Congratulations! You mastered the tables!");
    }
}

