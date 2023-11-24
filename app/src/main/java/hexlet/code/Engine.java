package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public final class Engine {
    private static String userName;
    private static final int indexQuestion = 0;
    private static final int indexAnswer = 1;
    private static String gameRule;


    public static void general(String result) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" + "Welcome to the Brain Games!\n" + "May I have your name? ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameRule);
        int count = 0;
        final int iterationCount = 3;
        String[] arrayQuestionsWithAnswers = result.split("!"); // [question@answer],[question@answer]
        while (count < iterationCount){
            var arrayGameQuestionAnswer = arrayQuestionsWithAnswers[count].split("@"); // [question],[answer]
            System.out.println("Question: " + arrayGameQuestionAnswer[indexQuestion]);
            System.out.print("Your answer: ");
            String userAnswer;
            userAnswer = scanner.nextLine();
            if (!arrayGameQuestionAnswer[indexAnswer].equals(userAnswer)) {
                System.out.println("'" + userAnswer + "'"
                        + " is wrong answer ;(. Correct answer was " + "'" + arrayGameQuestionAnswer[indexAnswer] + "'.\n"
                        + "Let's try again, " + userName + "!");
                break;
            }
            System.out.println("Correct!");
            count++;
        }
        if (count == iterationCount) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
    public static void setGameRule(String gameRuleCurrent) {
         gameRule = gameRuleCurrent;
    }
}



