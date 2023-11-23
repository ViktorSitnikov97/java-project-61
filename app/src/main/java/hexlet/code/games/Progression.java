package hexlet.code.games;

import java.util.Random;

public final class Progression {
    private String expression;
    private String answer;
    private static final String RULEPROGRESSION = "What number is missing in the progression?";
    private int step;
    private int firstElement;
    private int lengthProgression;
    private int divider;
    private int emptyElement;

    public String outputFromProgression() {
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
        return  expression + "@" + answer;
    }
    public int[] getProgression() {
        Random random = new Random();
        int bottomBoundFirstElement = 1;
        int upperBoundFirstElement = 20;
        firstElement = random.nextInt(upperBoundFirstElement) + bottomBoundFirstElement; // [1;20]
        int bottomBoundStep = 3;
        int upperBoundStep = 4;
        step = random.nextInt(upperBoundStep) + bottomBoundStep; // [3;6]
        int bottomBoundLengthProgression = 5;
        int upperBoundLengthProgression = 6;
        lengthProgression = random.nextInt(upperBoundLengthProgression) + bottomBoundLengthProgression; //[5;10]
        int[] arrayProgression = new int[lengthProgression + 1];
        for (int i = 0; i < arrayProgression.length; i++) {
            arrayProgression[i] = firstElement + step * i;
        }
        return arrayProgression;
    }
    public int getIndexEmptyElement() {
        Random indexEmptyElemRand = new Random();
        int bottomBoundDivider = 1;
        int upperBoundDivider = 5;
        divider = indexEmptyElemRand.nextInt(upperBoundDivider) + bottomBoundDivider; //[1;5]
        int indexEmptyElement = lengthProgression / divider;
        return indexEmptyElement;
    }
    public static String getRuleProgression() {
        return RULEPROGRESSION;
    }
}
