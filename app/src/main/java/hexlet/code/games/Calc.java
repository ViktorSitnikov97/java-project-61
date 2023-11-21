package hexlet.code.games;

import java.util.Random;

public class Calc {
    private String expression;
    private final String ruleCalc = "What is the result of the expression?";
    private char operationSymbol;
    private String result;
    private int firstValue;
    private int secondValue;
    private int resultInt;
    private int choiceNumber;

    public String questionCalculator() {
        Random firstRand = new Random();
        Random secondRand = new Random();
        Random choiceRand = new Random();
        firstValue = firstRand.nextInt(25);
        secondValue = secondRand.nextInt(50);
        choiceNumber = choiceRand.nextInt(3);

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
        return expression;
    }

    public String answerCalculator() {
        switch (operationSymbol) {
            case '+':
                resultInt =  firstValue + secondValue;
                break;
            case '-':
                resultInt =  firstValue - secondValue;
                break;
            case '*':
                resultInt =  firstValue * secondValue;
                break;
            default:
                break;
        }
        return String.valueOf(resultInt);
    }
    public String getRuleCalc() {
        return ruleCalc;
    }
}
