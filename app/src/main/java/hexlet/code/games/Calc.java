package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Calc {
    private static String expression;
    private static final String RULECALC = "What is the result of the expression?";
    private static char operationSymbol;
    private static int firstValue;
    private static int secondValue;
    private static int answer;
    private static int choiceNumber;

    public static void startGameCalc() {
        Engine.setGameRule(RULECALC);
        Random random = new Random();
        final int upperBoundFirstValue = 25;
        final int upperBoundSecondValue = 50;
        final int upperBoundChoiceNumber = 3;
        final int zeroNumber = 0;
        final int firstNumber = 1;
        final int secondNumber = 2;
        final int iterationCount = 3;
        final int iterationMainSeparator = 2;
        int count = 0;
        StringBuilder questionsWithAnswers = new StringBuilder();
        while (count < iterationCount) {
            firstValue = random.nextInt(upperBoundFirstValue);
            secondValue = random.nextInt(upperBoundSecondValue);
            choiceNumber = random.nextInt(upperBoundChoiceNumber);
            switch (choiceNumber) {
                case zeroNumber:
                    operationSymbol = '+';
                    break;
                case firstNumber:
                    operationSymbol = '-';
                    break;
                case secondNumber:
                    operationSymbol = '*';
                    break;
                default:
                    break;
            }
            expression = firstValue + " " + operationSymbol + " " + secondValue;
            questionsWithAnswers.append(expression);
            questionsWithAnswers.append("@");
            switch (operationSymbol) {
                case '+':
                    answer = firstValue + secondValue;
                    break;
                case '-':
                    answer = firstValue - secondValue;
                    break;
                case '*':
                    answer = firstValue * secondValue;
                    break;
                default:
                    break;
            }
            questionsWithAnswers.append(answer);
            if (count < iterationMainSeparator) {
                questionsWithAnswers.append("!");
            }
            count++;
        }
        Engine.general(questionsWithAnswers.toString());
    }
}

