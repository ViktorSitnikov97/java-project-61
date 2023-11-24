package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GreatComDiv;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public final class Engine {

    private static int number;
    private static String partsOutput;
    private static final int FIRST = 1;
    private static final int SECOND = 2;
    private static final int THIRD = 3;
    private static final int FOURTH = 4;
    private static final int FIFTH = 5;
    private static final int SIXTH = 6;
//    private static final Even EVEN = new Even();
//    private static final Calc CALC = new Calc();
//    private static final GreatComDiv GCD = new GreatComDiv();
//    private static final Progression PROG = new Progression();
    public static void general() {
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n"
                + "Your choice: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        if (number == 0) {
            return;
        }
        Cli inputName = new Cli();
        inputName.greet();
        switch (number) {
            case SECOND:
                System.out.println(Even.getRuleEven());
                break;
            case THIRD:
                System.out.println(Calc.getRuleCalc());
                break;
            case FOURTH:
                System.out.println(GreatComDiv.getRuleGCD());
                break;
            case FIFTH:
                System.out.println(Progression.getRuleProgression());
                break;
            case SIXTH:
                System.out.println(Prime.getRulePrime());
                break;
            default:
                break;
        }
        String answer;
        int count = 0;
        final int iterationCount = 3;
        if (combinedOutputFromGame(number) != null) {
            while (count < iterationCount) {
                partsOutput = combinedOutputFromGame(number);
                var parts = partsOutput.split("@");
                System.out.println("Question: " + parts[0]);
                System.out.print("Your answer: ");
                answer = inputName.userAnswer.nextLine();
                if (!answer.equals(parts[1])) {
                    System.out.println("'" + answer + "'"
                            + " is wrong answer ;(. Correct answer was " + "'" + parts[1] + "'.\n"
                            + "Let's try again, " + Cli.getUserName() + "!");
                    break;
                }
                System.out.println("Correct!");
                count++;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
        inputName.userAnswer.close();
        scanner.close();
    }

    public static String combinedOutputFromGame(int choiceNumber) {
        if (choiceNumber == FIRST) {
            return null;
        } else if (choiceNumber == SECOND) {
            Even even = new Even();
            return even.outputFromEven();
        } else if (choiceNumber == THIRD) {
            Calc calc = new Calc();
            return calc.outputFromCalculator();
        } else if (choiceNumber == FOURTH) {
            GreatComDiv gcd = new GreatComDiv();
            return gcd.outputFromGreatComDiv();
        } else if (choiceNumber == FIFTH) {
            Progression prog = new Progression();
            return prog.outputFromProgression();
        } else if (choiceNumber == SIXTH) {
            Prime prime = new Prime();
            return prime.outputFromPrime();
        } else {
            return null;
        }
    }
}
