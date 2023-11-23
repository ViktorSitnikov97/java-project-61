package hexlet.code.games;



import java.util.Random;

public final class Even {
    private final String yes = "yes";
    private final String no = "no";
    private int number;
    private String answer;
    private static final  String RULEEVEN = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public String outputFromEven() {
        Random rand = new Random();
        int upperBound = 100;
        number = rand.nextInt(upperBound);
        answer = number % 2 == 0 ? yes : no;
        return String.valueOf(number) + "@" + answer;
    }
    public static String getRuleEven() {
        return RULEEVEN;
    }
}

