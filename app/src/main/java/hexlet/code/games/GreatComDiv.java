package hexlet.code.games;

import java.util.Random;

public final class GreatComDiv {
    private String expression;
    private static final String RULEGCD = "Find the greatest common divisor of given numbers.";
    private int a;
    private int b;
    private int answer;
    public String outputFromGreatComDiv() {
        Random random = new Random();
        final int upperBound = 101;
        a = random.nextInt(upperBound); //[0;100]
        b = random.nextInt(upperBound); //[0;100]
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        answer = findingGCD(max, min);
        expression = String.valueOf(a) + " " + String.valueOf(b);
        return expression + "@" + String.valueOf(answer);
    }
    public int findingGCD(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return findingGCD(secondNumber, firstNumber % secondNumber);
    }
    public static String getRuleGCD() {
        return RULEGCD;
    }
}
