package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public final class Engine {
    private static String userName;
    private static String gameQuestion;
    private static String gameAnswer;
    private static String gameRule;
    private static boolean wasGreeting = false;
    private static boolean isContinue;
    private static final Scanner answer = new Scanner(System.in);

    public static void general() {

        if (!wasGreeting) {
            System.out.print("\n" + "Welcome to the Brain Games!\n" + "May I have your name? ");
            userName = answer.nextLine();
            System.out.println("Hello, " + userName + "!");
            System.out.println(gameRule);
            wasGreeting = true;
        }
            System.out.println("Question: " + gameQuestion);
            System.out.print("Your answer: ");
            String userAnswer;
            userAnswer = answer.nextLine();
            if (!gameAnswer.equals(userAnswer)) {
                System.out.println("'" + userAnswer + "'"
                        + " is wrong answer ;(. Correct answer was " + "'" + gameAnswer + "'.\n"
                        + "Let's try again, " + userName + "!");
                isContinue = false;
            }
            System.out.println("Correct!");
            isContinue = true;

    }
    public static void setUserName(String userNameCurrent) {
        userName = userNameCurrent;
    }
    public static boolean getExodus() {
        return isContinue;
    }
    public static void setGameAnswer(String gameAnswerCurrent) {
        gameAnswer = gameAnswerCurrent;
    }
    public static void setGameQuestion(String gameQuestionCurrent) {
        gameQuestion = gameQuestionCurrent;
    }
    public static void setGameRule(String gameRuleCurrent) {
         gameRule = gameRuleCurrent;
    }
    public static void congratulate() {
        System.out.println("Congratulations, " + userName + "!");
    }
    public static void closeScanner() {
        answer.close();
    }


}



