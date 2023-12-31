package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static final int ROUNDS = 3;
    private static final int INDEX_QUESTION = 0;
    private static final int INDEX_ANSWER = 1;

    public static void general(String[][] roundsData, String gameRule) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" + "Welcome to the Brain Games!\n" + "May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameRule);
        for (String[] data : roundsData) {
            System.out.println("Question: " + data[INDEX_QUESTION]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            if (!data[INDEX_ANSWER].equals(userAnswer)) {
                scanner.close();
                System.out.println("'" + userAnswer + "'"
                        + " is wrong answer ;(. Correct answer was " + "'"
                        + data[INDEX_ANSWER] + "'.\n"
                        + "Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}



