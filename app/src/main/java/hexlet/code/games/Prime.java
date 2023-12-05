package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;

public final class Prime {
    private static final int MAX = 100;

    public static void startGamePrime() {
        final String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int[] arrayWithPrimeNumbers = getArrayPrime();
        String[][] roundsData = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            roundsData[i] = generateRoundDataPrime(arrayWithPrimeNumbers);
        }
        Engine.general(roundsData, rule);
    }

    private static String[] generateRoundDataPrime(int[] arrayPrime) {
        final int bottomBound = 2;
        int number = Utils.generateNumber(bottomBound, MAX);
        String question = String.valueOf(number);
        String answer = isPrime(number, arrayPrime) ? "yes" : "no";
        return new String[]{question, answer};
    }

    private static boolean isPrime(int number, int[] array) {
        return ArrayUtils.contains(array, number);
    }

    private static int[] getArrayPrime() {
        int[] array = new int[MAX + 1];
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

