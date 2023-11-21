package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class Engine {

    private static int number;
    private static final Even EVEN = new Even();
    private static final Calc CALC = new Calc();
    public static void general() {
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit\n"
                + "Your choice: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        if (number == 0) {
            return;
        }
        Cli.greet();
        String answer;
        int count = 0;
        switch (number) {
            case 2:
                System.out.println(EVEN.getRuleEven());
                break;
            case 3:
                System.out.println(CALC.getRuleCalc());
                break;
            default:
                break;
        }
        while (count < 3) {
            if (gameQuestion(number) == null) {
                break;
            }
            System.out.println("Question: " + gameQuestion(number));
            System.out.print("Your answer: ");
            answer = Cli.userAnswer.nextLine();
            if (!answer.equals(gameAnswer(number))) {
                System.out.println("'" + answer + "'"
                        + " is wrong answer ;(. Correct answer was " + "'" + gameAnswer(number) + "'.\n"
                        + "Let's try again, " + Cli.getUserName() + "!");
                break;
            }
            System.out.println("Correct!");
            count++;
        }
        if (count == 3) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
        Cli.closeScanner();
        scanner.close();
    }

    public static String gameQuestion(int choiceNumber) {
        if (choiceNumber == 1) {
            return null;
        } else if (choiceNumber == 2) {
            return EVEN.questionEven();
        } else if (choiceNumber == 3) {
            return CALC.questionCalculator();
        } else {
            return null;
        }
    }
    public static String gameAnswer(int choiceNumber) {
        if (choiceNumber == 1) {
            return null;
        } else if (choiceNumber == 2) {
            return EVEN.answerEven();
        } else if (choiceNumber == 3) {
            return CALC.answerCalculator();
        } else {
            return null;
        }
    }
}
