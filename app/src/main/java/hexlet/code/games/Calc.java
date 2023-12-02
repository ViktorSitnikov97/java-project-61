package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.generateNumber;

public final class Calc {
    public static void startGameCalc() {
        final String rule = "What is the result of the expression?";
        final int roundsCount = 3;
        final int amountData = 2;
        String[][] roundsData = new String[roundsCount][amountData];
        for (int i = 0; i < roundsCount; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.general(roundsData, rule);
    }

    public static String[] generateRoundData() {
        final int upperBoundValue = 100;
        final int bottomBoundValue = 20;
        final int upperBoundChoiceNumber = 2;
        final int bottomBoundChoiceNumber = 0;
        int firstValue = generateNumber(bottomBoundValue, upperBoundValue);
        int secondValue = generateNumber(bottomBoundValue, upperBoundValue);
        int choiceNumber = generateNumber(bottomBoundChoiceNumber, upperBoundChoiceNumber);
        String choiceOperation = String.valueOf(choiceNumber);
        char operator;
        switch (choiceOperation) {
            case "0":
                operator = '+';
                break;
            case "1":
                operator = '-';
                break;
            case "2":
                operator = '*';
                break;
            default:
                throw new RuntimeException("Operation selection error " + choiceOperation);
        }
        final int lengthData = 2;
        final int firstElement = 0;
        final int secondElement = 1;
        String[] data = new String[lengthData];
        String expression = firstValue + " " + operator + " " + secondValue;
        data[firstElement] = expression;
        int answer = calculate(operator, firstValue, secondValue);
        data[secondElement] = String.valueOf(answer);
        return data;
    }

    private static int calculate(char operator, int number1, int number2) {
        int result;
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            default:
                throw new RuntimeException("Unknown operator: " + operator);
        }
        return result;
    }
}




