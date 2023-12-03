package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
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
        String selectedGame = scanner.next();

        switch (selectedGame) {
            case "1":
                Cli.greet();
                break;
            case "2":
                Even.startGameEven();
                break;
            case "3":
                Calc.startGameCalc();
                break;
            case "4":
                GCD.startGameGreatComDiv();
                break;
            case "5":
                Progression.startGameProgression();
                break;
            case "6":
                Prime.startGamePrime();
                break;
            case "0":
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid number entered. Restart the game.");
                break;
        }
        scanner.close();

    }

}
