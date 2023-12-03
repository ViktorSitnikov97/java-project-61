package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.generateNumber;

public final class GCD {
    public static void startGameGreatComDiv() {
        final String rule = "Find the greatest common divisor of given numbers.";
        String[][] roundsData = new String[Engine.ROUNDS][Engine.QUANTITY_DATA];
        final int upperBound = 100;
        final int bottomBound = 0;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            roundsData[i] = generateRoundDataGCD(bottomBound, upperBound);
        }
        Engine.general(roundsData, rule);
    }
    private static String[] generateRoundDataGCD(int bottomBound, int upperBound) {
        int a = generateNumber(bottomBound, upperBound);
        int b = generateNumber(bottomBound, upperBound);
        String expression = a + " " + b;
        int answer = gcd(a, b);
        return new String[]{expression, String.valueOf(answer)};
    }
    private static int gcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return gcd(secondNumber, firstNumber % secondNumber);
    }
}

