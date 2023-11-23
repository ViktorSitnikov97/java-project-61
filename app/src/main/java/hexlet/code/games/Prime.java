package hexlet.code.games;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Random;

public final class Prime {
    private String expression;
    private String answer;
    private final String yes = "yes";
    private final String no = "no";
    private static final String RULEPRIME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private int number;
    private final int upperBoundNumber = 99;
    private final int buttonBoundNumber = 2;
    public String outputFromPrime() {
        expression = String.valueOf(getIsPrime());
        return expression + "@" + answer;
    }
    public int getIsPrime() {
        Random rand = new Random();

        number = rand.nextInt(upperBoundNumber) + buttonBoundNumber; //[2;100]
        int[] arrayWithPrimeNumbers = getArrayPrime();
        answer = ArrayUtils.contains(arrayWithPrimeNumbers, number) ? yes : no;
        return number;
    }
    public int[] getArrayPrime() {
        int lengthArray = 100;
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

    public static String getRulePrime() {
        return RULEPRIME;
    }
}
