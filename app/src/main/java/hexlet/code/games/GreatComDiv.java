package hexlet.code.games;

import java.util.Random;

public class GreatComDiv {
    private String expression;
    private final String ruleGCD = "Find the greatest common divisor of given numbers.";
    private int a;
    private int b;
    private int answer;
    public String outputFromGreatComDiv() {
        Random random = new Random();
        a = random.nextInt(101);
        b = random.nextInt(101);
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
