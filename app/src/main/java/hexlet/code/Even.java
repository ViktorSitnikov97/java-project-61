package hexlet.code;

import java.util.Random;

public class Even {
    public static void isEven() {
        int count = 0;
        String yes = "yes";
        String no = "no";
        Cli.greet();
        Random rand = new Random();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (count < 3) {
            int number = rand.nextInt(100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = Cli.scan.nextLine();
            String result = number % 2 == 0 ? yes : no;
            if (!answer.equals(result)) {
                break;
            }
            System.out.println("Correct!");
            count++;
        }
        if (count == 3) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
        Cli.closeScanner();
    }
}
