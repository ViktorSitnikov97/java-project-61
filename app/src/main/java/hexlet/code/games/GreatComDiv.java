package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class GreatComDiv {
    private static final String RULEGCD = "Find the greatest common divisor of given numbers.";
    public static void startGameGreatComDiv() {
        Engine.setGameRule(RULEGCD);
        Random random = new Random();
        final int upperBound = 101;
        int count = 0;
        final int iterationCount = 3;
        final int iterationMainSeparator = 2;
        StringBuilder questionsWithAnswers = new StringBuilder();
        int a;
        int b;
        String expression;
        int answer;
        while (count < iterationCount) {
            a = random.nextInt(upperBound); //[0;100]
            b = random.nextInt(upperBound); //[0;100]
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            answer = findingGCD(max, min);
            expression = String.valueOf(a) + " " + String.valueOf(b);
            questionsWithAnswers.append(expression);
            questionsWithAnswers.append("@");
            questionsWithAnswers.append(answer);
            if (count < iterationMainSeparator) {
                questionsWithAnswers.append("!");
            }
            count++;
        }
        Engine.general(questionsWithAnswers.toString());

    }
    public static int findingGCD(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return findingGCD(secondNumber, firstNumber % secondNumber);
    }
}

