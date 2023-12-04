package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.generateNumber;

public final class Progression {

    public static void startGameProgression() {
        final String rule = "What number is missing in the progression?";
        String[][] roundsData = new String[Engine.ROUNDS][Engine.QUANTITY_DATA];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            roundsData[i] = generateRoundDataProgression();
        }
        System.out.println(Engine.general(roundsData, rule));
    }

    private static String[] generateRoundDataProgression() {
        final int bottomBoundFirstElement = 1;
        final int upperBoundFirstElement = 20;
        int first = generateNumber(bottomBoundFirstElement, upperBoundFirstElement);
        final int bottomBoundStep = 3;
        final int upperBoundStep = 7;
        int step = generateNumber(bottomBoundStep, upperBoundStep);
        final int progressionLength = 8;
        String[] progression = makeProgression(first, step, progressionLength);
        int hiddenMemberIndex = generateNumber(0, progressionLength - 1);
        String answer = progression[hiddenMemberIndex];
        progression[hiddenMemberIndex] = "..";
        String question = String.join(" ", progression);
        return new String[]{question, answer};
    }

    private static String[] makeProgression(int firstElement, int step, int progressionLength) {
        String[] arrayProgression = new String[progressionLength + 1];
        for (int i = 0; i < arrayProgression.length; i++) {
            arrayProgression[i] = String.valueOf(firstElement + step * i);
        }
        return arrayProgression;
    }
}
