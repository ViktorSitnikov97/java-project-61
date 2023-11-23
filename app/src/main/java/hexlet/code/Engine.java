package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GreatComDiv;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {

    private static int number;
    private static String partsOutput;
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
                System.out.println(Even.getRuleEven());
                break;
            case 3:
                System.out.println(Calc.getRuleCalc());
                break;
            case 4:
                System.out.println(GreatComDiv.getRuleGCD());
                break;
            case 5:
                System.out.println(Progression.getRuleProgression());
                break;
            default:
                break;
        }
        if (combinedOutputFromGame(number) != null) {
            while (count < 3) {
                partsOutput = combinedOutputFromGame(number);
                var parts = partsOutput.split("@");
                System.out.println("Question: " + parts[0]);
                System.out.print("Your answer: ");
                answer = Cli.userAnswer.nextLine();
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
        Cli.closeScanner();
        scanner.close();
    }

    public static String combinedOutputFromGame(int choiceNumber) {
        if (choiceNumber == 1) {
            return null;
        } else if (choiceNumber == 2) {
            Even even = new Even();
            return even.outputFromEven();
        } else if (choiceNumber == 3) {
            Calc calc = new Calc();
            return calc.outputFromCalculator();
        } else if (choiceNumber == 4) {
            GreatComDiv gcd = new GreatComDiv();
            return gcd.outputFromGreatComDiv();
        } else if (choiceNumber == 5) {
            Progression prog = new Progression();
            return prog.outputFromProgression();
        } else {
            return null;
        }
    }
}
