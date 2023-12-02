package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;

public final class Prime {
    public static void startGamePrime() {
        final String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int[] arrayWithPrimeNumbers = getArrayPrime();
        final int roundsCount = 3;
        final int amountData = 2;
        String[][] roundsData = new String[roundsCount][amountData];
        for (int i = 0; i < roundsCount; i++) {
            roundsData[i] = generateRoundData(arrayWithPrimeNumbers);
        }
        Engine.general(roundsData, rule);
    }
    private static String[] generateRoundData(int[] arrayPrime) {
        final int bottomBound = 2;
        final int upperBound = 100;
        final int lengthData = 2;
        final int firstElement = 0;
        final int secondElement = 1;
        String[] data = new String[lengthData];
        int number = Utils.generateNumber(bottomBound, upperBound);
        String question = String.valueOf(number);
        data[firstElement] = question;
        String answer = isPrime(number, arrayPrime) ? "yes" : "no";
        data[secondElement] = answer;
        return data;
    }
    private static boolean isPrime(int number, int[] array) {
        return ArrayUtils.contains(array, number);
    }
    private static int[] getArrayPrime() {
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

