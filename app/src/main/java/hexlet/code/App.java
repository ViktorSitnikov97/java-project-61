package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    private static int selectedGame;
    private static final int FIRST = 1;
    private static final int SECOND = 2;
    private static final int THIRD = 3;
    private static final int FOURTH = 4;
    private static final int FIFTH = 5;
    private static final int SIXTH = 6;
    public static void main(String[] args) {
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
        selectedGame = scanner.nextInt();

        switch (selectedGame) {
            case FIRST:
                Cli.greet();
                break;
            case SECOND:
                Even.startGameEven();
                break;
            case THIRD:
                Calc.startGameCalc();
                break;
            case FOURTH:
                GreatComDiv.startGameGreatComDiv();
                break;
            case FIFTH:
                Progression.startGameProgression();
                break;
            case SIXTH:
                System.out.println(Prime.getRulePrime());
                break;
            default:
                System.out.println("GoodBye!");
                break;
        }
        scanner.close();

    }

}
