package hexlet.code;

import java.util.Scanner;

public final class Cli {
    private static String userName;

    public static void greet() {
        Scanner userAnswer = new Scanner(System.in);
        System.out.print("\n" + "Welcome to the Brain Games!\n" + "May I have your name? ");
        userName = userAnswer.nextLine();
        System.out.println("Hello, " + userName + "!");
        userAnswer.close();
    }
}
