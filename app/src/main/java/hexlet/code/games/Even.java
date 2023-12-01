package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {
    public static void startGameEven() {
        final String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int roundsCount = 3;
        final int amountData = 2;
        String[][] roundsData = new String[roundsCount][amountData];
        for (int i = 0; i < roundsCount; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.general(roundsData, rule);
    }
    public static String[] generateRoundData() {
        final int bottomBound = 1;
        final int upperBound = 100;
        final int lengthData = 2;
        final int firstElement = 0;
        final int secondElement = 1;
        int number = Utils.generateNumber(bottomBound,upperBound);
        String question = String.valueOf(number);
        String answer = number % 2 == 0 ? "yes" : "no";
        String[] data = new String[lengthData];
        data[firstElement] = question;
        data[secondElement] = answer;
        return data;
    }
}



