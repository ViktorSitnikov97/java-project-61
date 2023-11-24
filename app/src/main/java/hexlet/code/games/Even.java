package hexlet.code.games;



import hexlet.code.Engine;

import java.util.Random;

public final class Even {
    private static final String YES = "yes";
    private static final String NO = "no";
    private static int number;
    private static String answer;
    private static final String RULEEVEN = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startGameEven() {
        Engine.setGameRule(RULEEVEN);
        int count = 0;
        final int iterationCount = 3;
        final int iterationMainSeparator = 2;
        StringBuilder questionsWithAnswers = new StringBuilder();
        while (count < iterationCount) {
            Random rand = new Random();
            final int upperBound = 100;
            number = rand.nextInt(upperBound); //[0;99]
            answer = number % 2 == 0 ? YES : NO;
            questionsWithAnswers.append(number);
            questionsWithAnswers.append("@");
            questionsWithAnswers.append(answer);
            if (count < iterationMainSeparator) {
                questionsWithAnswers.append("!");
            }
            count++;
        }
        Engine.general(questionsWithAnswers.toString());
    }
}


