package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Random;

public final class Prime {
    private static String expression;
    private static String answer;
    private static final String yes = "yes";
    private static final String no = "no";
    private static final String RULEPRIME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void startGamePrime() {
        Engine.setGameRule(RULEPRIME);
        int count = 0;
        final int iterationCount = 3;
        final int iterationMainSeparator = 2;
        StringBuilder questionsWithAnswers = new StringBuilder();
        while (count < iterationCount) {
            expression = String.valueOf(getIsPrime());
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

    public static int getIsPrime() {
        Random rand = new Random();
        final int upperBoundNumber = 99;
        final int buttonBoundNumber = 2;
        int number;
        number = rand.nextInt(upperBoundNumber) + buttonBoundNumber; //[2;100]
        int[] arrayWithPrimeNumbers = getArrayPrime();
        answer = ArrayUtils.contains(arrayWithPrimeNumbers, number) ? yes : no;
        return number;
    }

    public static int[] getArrayPrime() {
        final int lengthArray = 100;
        int[] array = new int[lengthArray];
        int count = 0;
        for (int i = 2; i < array.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                array[count] = i;
                count++;
            }
        }
        return Arrays.copyOfRange(array, 0, count);
    }
}

