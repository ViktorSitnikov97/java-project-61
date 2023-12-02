package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.generateNumber;

public final class GreatComDiv {
    public static void startGameGreatComDiv() {
        final String rule = "Find the greatest common divisor of given numbers.";
        final int roundsCount = 3;
        final int amountData = 2;
        String[][] roundsData = new String[roundsCount][amountData];
        for (int i = 0; i < roundsCount; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.general(roundsData, rule);
    }
    private static String[] generateRoundData() {
        final int upperBound = 100;
        final int bottomBound = 0;
        int a = generateNumber(bottomBound, upperBound);
        int b = generateNumber(bottomBound, upperBound);
        final int lengthData = 2;
        final int firstElement = 0;
        final int secondElement = 1;
        String[] data = new String[lengthData];
        String expression = a + " " + b;
        data[firstElement] = expression;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int answer = gcd(max, min);
        data[secondElement] = String.valueOf(answer);
        return data;
    }
    private static int gcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return gcd(secondNumber, firstNumber % secondNumber);
    }
}

