package hexlet.code.games;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Random;

public class Prime {
    private String expression;
    private String answer;
    private final String yes = "yes";
    private final String no = "no";
    private static final String RULEPRIME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    Random rand = new Random();
    private int number;
    public String outputFromPrime() {
        expression = String.valueOf(getIsPrime());
        return expression + "@" + answer;
    }
    public int getIsPrime() {
        number = rand.nextInt(99) + 2; //[2;100]
        int[] arrayWithPrimeNumbers = getArrayPrime();
        answer = ArrayUtils.contains(arrayWithPrimeNumbers, number) ? yes : no;
        return number;
    }
    public int[] getArrayPrime() {
        int[] array = new int[100];
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
