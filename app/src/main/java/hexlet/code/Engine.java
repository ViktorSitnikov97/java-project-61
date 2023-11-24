package hexlet.code;

import java.util.Scanner;

public final class Engine {
    private static final int INDEXQUESTION = 0;
    private static final int INDEXANSWER = 1;
    private static String gameRule;


    public static void general(String result) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" + "Welcome to the Brain Games!\n" + "May I have your name? ");
        String userName;
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameRule);
        int count = 0;
        final int iterationCount = 3;
        String[] arrayQuestionsWithAnswers = result.split("!"); // [question@answer],[question@answer]
        while (count < iterationCount) {
            var arrayGameQuestionAnswer = arrayQuestionsWithAnswers[count].split("@"); // [question],[answer]
            System.out.println("Question: " + arrayGameQuestionAnswer[INDEXQUESTION]);
            System.out.print("Your answer: ");
            String userAnswer;
            userAnswer = scanner.nextLine();
            if (!arrayGameQuestionAnswer[INDEXANSWER].equals(userAnswer)) {
                System.out.println("'" + userAnswer + "'"
                        + " is wrong answer ;(. Correct answer was " + "'"
                        + arrayGameQuestionAnswer[INDEXANSWER] + "'.\n"
                        + "Let's try again, " + userName + "!");
                break;
            }
            System.out.println("Correct!");
            count++;
        }
        if (count == iterationCount) {
            System.out.println("Congratulations, " + userName + "!");
        }
        scanner.close();
    }
    public static void setGameRule(String gameRuleCurrent) {
        gameRule = gameRuleCurrent;
    }
}



