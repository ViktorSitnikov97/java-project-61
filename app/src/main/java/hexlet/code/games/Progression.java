package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Progression {
    private static String expression;
    private static String answer;
    private static final String RULEPROGRESSION = "What number is missing in the progression?";
    private static int lengthProgression;
    private static int emptyElement;

    public static void startGameProgression() {
        Engine.setGameRule(RULEPROGRESSION);
        int count = 0;
        final int iterationCount = 3;
        final int iterationMainSeparator = 2;
        StringBuilder questionsWithAnswers = new StringBuilder();
        while (count < iterationCount) {
            StringBuilder stringProgression = new StringBuilder();
            int[] array = getProgression();
            int indexEmptyElement = getIndexEmptyElement();
            for (int i = 0; i < array.length; i++) {
                if (i != indexEmptyElement) {
                    stringProgression.append(array[i]);
                    stringProgression.append(" ");
                } else {
                    stringProgression.append(".. ");
                }
            }
            expression = stringProgression.toString();
            emptyElement = array[indexEmptyElement];
            answer = String.valueOf(emptyElement);
            questionsWithAnswers.append(expression);
            questionsWithAnswers.append("@");
            questionsWithAnswers.append(answer);
            if (count < iterationMainSeparator) {
                questionsWithAnswers.append("!");
            }
            count++;
        }
        Engine.general(questionsWithAnswers.toString());
    }

    public static int[] getProgression() {
        Random random = new Random();
        final int bottomBoundStep = 3;
        final int upperBoundStep = 4;
        final int bottomBoundFirstElement = 1;
        final int upperBoundFirstElement = 20;
        final int bottomBoundLengthProgression = 5;
        final int upperBoundLengthProgression = 6;
        int firstElement = random.nextInt(upperBoundFirstElement) + bottomBoundFirstElement; // [1;20]
        int step = random.nextInt(upperBoundStep) + bottomBoundStep; // [3;6]
        lengthProgression = random.nextInt(upperBoundLengthProgression) + bottomBoundLengthProgression; //[5;10]
        int[] arrayProgression = new int[lengthProgression + 1];
        for (int i = 0; i < arrayProgression.length; i++) {
            arrayProgression[i] = firstElement + step * i;
        }
        return arrayProgression;
    }
    public static int getIndexEmptyElement() {
        Random indexEmptyElemRand = new Random();
        int divider;
        final int bottomBoundDivider = 1;
        final int upperBoundDivider = 5;
        divider = indexEmptyElemRand.nextInt(upperBoundDivider) + bottomBoundDivider; //[1;5]
        int indexEmptyElement = lengthProgression / divider;
        return indexEmptyElement;
    }
}
