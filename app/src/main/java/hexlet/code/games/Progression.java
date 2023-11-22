package hexlet.code.games;

import java.util.Random;

public class Progression {
    private String expression;
    private String answer;
    private final String ruleProgression = "What number is missing in the progression?";
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
        Random firstElemRand = new Random();
        firstElement = firstElemRand.nextInt(20) + 1; // [1;20]
        Random stepRand = new Random();
        step = stepRand.nextInt(6) + 2; // [2;7]
        Random lengthRand = new Random();
        lengthProgression = lengthRand.nextInt(6) + 5; //[5;10]
        int[] arrayProgression = new int[lengthProgression + 1];
        for (int i = 0; i < arrayProgression.length; i++) {
            arrayProgression[i] = firstElement + step * i;
        }
        return arrayProgression;
    }
    public int getIndexEmptyElement() {
        Random indexEmptyElemRand = new Random();
        divider = indexEmptyElemRand.nextInt(5) + 1; //[1;5]
        int indexEmptyElement = lengthProgression / divider;
        return indexEmptyElement;
    }
    public String getRuleProgression() {
        return ruleProgression;
    }
}
