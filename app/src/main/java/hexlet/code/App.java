package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit\n"
                + "Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                Cli.greet();
                break;
            case 2:
                Even.isEven();
                break;
            case 0:
                break;
            default:
                break;
        }
        scanner.close();

    }
}
