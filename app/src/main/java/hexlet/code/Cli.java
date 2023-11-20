package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greet() {
        Scanner scan = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scan.nextLine();
        System.out.println("Hello, " + userName + "!");
        scan.close();
    }

}
