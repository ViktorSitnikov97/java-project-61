package hexlet.code;

import java.util.Scanner;

public final class Engine {
    private static final int INDEX_QUESTION = 0;
    private static final int INDEX_ANSWER = 1;

    public static void general(String[][] roundsData, String gameRule) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" + "Welcome to the Brain Games!\n" + "May I have your name? ");
        String userName;
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameRule);
        int count = 0;
        final int roundsCount = 3;
        while (count < roundsCount) {
            System.out.println("Question: " + roundsData[count][INDEX_QUESTION]);
            System.out.print("Your answer: ");
            String userAnswer;
            userAnswer = scanner.nextLine();
            if (!roundsData[count][INDEX_ANSWER].equals(userAnswer)) {
                System.out.println("'" + userAnswer + "'"
                        + " is wrong answer ;(. Correct answer was " + "'"
                        + roundsData[count][INDEX_ANSWER] + "'.\n"
                        + "Let's try again, " + userName + "!");
                break;
            }
            System.out.println("Correct!");
            count++;
        }
        if (count == roundsCount) {
            System.out.println("Congratulations, " + userName + "!");
        }
        scanner.close();
    }
}



