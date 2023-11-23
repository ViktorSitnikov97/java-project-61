package hexlet.code.games;

import java.util.Random;

public final class Calc {
    private String expression;
    private static final String RULECALC = "What is the result of the expression?";
    private char operationSymbol;
    private int firstValue;
    private int secondValue;
    private int answer;
    private int choiceNumber;

    public String outputFromCalculator() {
        Random random = new Random();
        int upperBoundFirstValue = 25;
        firstValue = random.nextInt(upperBoundFirstValue);
        int upperBoundSecondValue = 50;
        secondValue = random.nextInt(upperBoundSecondValue);
        int upperBoundChoiceNumber = 3;
        choiceNumber = random.nextInt(upperBoundChoiceNumber);
        switch (choiceNumber) {
            case 0:
                operationSymbol = '+';
                break;
            case 1:
                operationSymbol = '-';
                break;
            case 2:
                operationSymbol = '*';
                break;
            default:
                break;
        }
        expression = firstValue + " " + operationSymbol + " " + secondValue;
        switch (operationSymbol) {
            case '+':
                answer =  firstValue + secondValue;
                break;
            case '-':
                answer =  firstValue - secondValue;
                break;
            case '*':
                answer =  firstValue * secondValue;
                break;
            default:
                break;
        }
        return expression + "@" + String.valueOf(answer);
    }
    public static String getRuleCalc() {
        return RULECALC;
    }
}
