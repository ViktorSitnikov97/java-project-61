package hexlet.code.games;

import java.util.Random;

public class GreatComDiv {
    private String expression;
    private final String ruleGCD = "Find the greatest common divisor of given numbers.";
    private int a;
    private int b;
    private int answer;
    public String outputFromGreatComDiv() {
        Random firstRand = new Random();
        Random secondRand = new Random();
        a = firstRand.nextInt(101);
        b = secondRand.nextInt(101);
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
    public String getRuleGCD() {
        return ruleGCD;
    }
}
