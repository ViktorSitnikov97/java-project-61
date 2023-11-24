package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String userName;
    Scanner userAnswer = new Scanner(System.in);
    public void greet() {
        System.out.print("\n" + "Welcome to the Brain Games!\n" + "May I have your name? ");
        userName = userAnswer.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
    public static String getUserName() {
        return userName;
    }
}
