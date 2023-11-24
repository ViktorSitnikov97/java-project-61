package hexlet.code.games;



import hexlet.code.Engine;

import java.util.Random;

public final class Even {
    private static final String yes = "yes";
    private static final String no = "no";
    private static int number;
    private static String answer;
    private static final String RULEEVEN = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startGameEven() {
        Engine.setGameRule(RULEEVEN);
        boolean isContinue = true;
        int count = 0;
        final int iterationCount = 3;
        while (count < iterationCount) {
            Random rand = new Random();
            final int upperBound = 100;
            number = rand.nextInt(upperBound); //[0;99]
            answer = number % 2 == 0 ? yes : no;
            Engine.setGameQuestion(String.valueOf(number));
            Engine.setGameAnswer(answer);
            Engine.general();
            isContinue = Engine.getExodus();
            if (!isContinue) {
                break;
            }
            count++;
        }
        Engine.closeScanner();
        if (count == iterationCount) {
            Engine.congratulate();
        }
    }
}


