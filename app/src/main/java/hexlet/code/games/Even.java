package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {
    public static void startGameEven() {
        final String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = new String[Engine.ROUNDS][Engine.QUANTITY_DATA];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            roundsData[i] = generateRoundDataEven();
        }
        Engine.general(roundsData, rule);
    }
    public static String[] generateRoundDataEven() {
        final int bottomBound = 1;
        final int upperBound = 100;
        int number = Utils.generateNumber(bottomBound, upperBound);
        String question = String.valueOf(number);
        String answer = number % 2 == 0 ? "yes" : "no";
        return new String[]{question, answer};
    }
}



