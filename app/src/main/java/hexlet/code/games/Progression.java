package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.generateNumber;

public final class Progression {

    public static void startGameProgression() {
        final String rule = "What number is missing in the progression?";
        final int roundsCount = 3;
        final int amountData = 2;
        String[][] roundsData = new String[roundsCount][amountData];
        for (int i = 0; i < roundsCount; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.general(roundsData, rule);
    }
    private static String[] generateRoundData() {
        final int bottomBoundFirstElement = 1;
        final int upperBoundFirstElement = 20;
        int first = generateNumber(bottomBoundFirstElement, upperBoundFirstElement);
        final int bottomBoundStep = 3;
        final int upperBoundStep = 7;
        int step = generateNumber(bottomBoundStep, upperBoundStep);
        final int bottomBoundProgressionLength = 7;
        final int upperBoundProgressionLength = 10;
        int progressionLength = generateNumber(bottomBoundProgressionLength, upperBoundProgressionLength);
        String[] progression = makeProgression(first, step, progressionLength);
        int emptyElementIndex = hiddenMemberIndex(progressionLength);
        final int lengthData = 2;
        final int firstElement = 0;
        final int secondElement = 1;
        String[] data = new String[lengthData];
        String answer = progression[emptyElementIndex];
        data[secondElement] = answer;
        progression[emptyElementIndex] = "..";
        String question = String.join(" ", progression);
        data[firstElement] = question;
        return data;
    }

    private static String[] makeProgression(int firstElement, int step, int progressionLength) {
        String[] arrayProgression = new String[progressionLength + 1];
        for (int i = 0; i < arrayProgression.length; i++) {
            arrayProgression[i] = String.valueOf(firstElement + step * i);
        }
        return arrayProgression;
    }
    private static int hiddenMemberIndex(int progressionLength) {
        final int bottomBoundProgression = 0;
        final int upperBoundProgression = progressionLength - 1;
        return generateNumber(bottomBoundProgression, upperBoundProgression);
    }
}
